package com.learn.bookmyshow.Repository;

import com.learn.bookmyshow.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking,Long> {
    @Override
    Optional<Booking> findById(Long aLong);

    Booking save(Booking booking);
}
