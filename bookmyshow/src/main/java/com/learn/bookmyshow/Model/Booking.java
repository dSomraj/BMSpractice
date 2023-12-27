package com.learn.bookmyshow.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter @Entity
public class Booking extends BaseModel {
    @ManyToMany
    private List<ShowSeat> showSeats;  //one might cancel the booking so the same showseat can go to another booking

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;

    @ManyToOne
    private Show show;

    @OneToMany
    private List<Payment> payments;

    @ManyToOne
    private User user;
    private int amount;

}
