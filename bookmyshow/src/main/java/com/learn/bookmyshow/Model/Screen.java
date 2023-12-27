package com.learn.bookmyshow.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter @Entity
public class Screen extends BaseModel {
    private String screenName;

    @OneToMany
    private List<Seat> seats;
}
