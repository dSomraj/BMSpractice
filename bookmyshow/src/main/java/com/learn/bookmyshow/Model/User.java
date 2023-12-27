package com.learn.bookmyshow.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter
@Entity
public class User extends BaseModel {
    private String userName;

    @OneToMany
    private List<Booking> bookings;

}
