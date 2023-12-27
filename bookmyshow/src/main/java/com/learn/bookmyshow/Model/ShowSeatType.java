package com.learn.bookmyshow.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class ShowSeatType {
    @ManyToOne
    private Show show;

    @ManyToOne
    private SeatType seatType;
    private int price;
}
