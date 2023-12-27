package com.learn.bookmyshow.Service;
import com.learn.bookmyshow.Model.*;
import com.learn.bookmyshow.Repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private UserRepository userRepository;
    private BookingRepository bookingRepository;
    private ShowSeatRepository showSeatRepository;
    private ShowRepository showRepository;
    public BookingService(UserRepository userRepository,BookingRepository bookingRepository,ShowSeatRepository showSeatRepository,ShowRepository showRepository){
        this.userRepository=userRepository;
        this.bookingRepository=bookingRepository;
        this.showRepository=showRepository;
        this.showRepository=showRepository;
    }
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking issueTicket(Long showId, Long userId, List<Long>showSeatIds){
        Optional<User> userOptional=userRepository.findById(userId);
        if(!userOptional.isPresent()){
            throw  new RuntimeException();
        }
        User user=userOptional.get();

        Optional<Show> showOptional=showRepository.findById(showId);
        if(!showOptional.isPresent()){
            throw new RuntimeException();
        }
        Show show=showOptional.get();
        List<ShowSeat> showSeats=showSeatRepository.findAllById(showSeatIds);
        for(ShowSeat s:showSeats){
            if(s.getShowSeatStatus()== ShowSeatStatus.BLOCKED || s.getShowSeatStatus()==ShowSeatStatus.BOOKED){
                throw  new RuntimeException();
            }
        }
        // if not blocked/booked we can book the tickets so first lets blocked the seats for the current user
        List<ShowSeat>savedShowSeats=new ArrayList<>();
        for(ShowSeat s:showSeats){
            s.setShowSeatStatus(ShowSeatStatus.BLOCKED);
            s.setBlockedAt(new Date());
            showSeatRepository.save(s);
            savedShowSeats.add(s);
        }
        Booking bookingTicket=new Booking();
        bookingTicket.setBookingStatus(BookingStatus.LOCKED);
        bookingTicket.setUser(user);
        bookingTicket.setShowSeats(savedShowSeats);
        bookingTicket.setShow(show);
        bookingTicket.setId(101111);
        bookingRepository.save(bookingTicket);
        return bookingTicket;
    }



}
