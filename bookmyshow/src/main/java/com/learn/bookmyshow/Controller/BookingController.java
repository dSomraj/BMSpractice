package com.learn.bookmyshow.Controller;

import com.learn.bookmyshow.Dto.IssueTicketRequestDto;
import com.learn.bookmyshow.Dto.IssueTicketResponseDto;
import com.learn.bookmyshow.Model.Booking;
import com.learn.bookmyshow.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;
    @Autowired
    public BookingController(BookingService bookingService){
        this.bookingService=bookingService;
    }
    public IssueTicketResponseDto bookTicket(IssueTicketRequestDto issueTicketRequestDto){
        IssueTicketResponseDto issueTicketResponseDto=new IssueTicketResponseDto();
        Booking booking;
        try{
            //booking=bookingService.bookTicket();
        }
        catch (Exception e){

        }
        return null;

    }

}
