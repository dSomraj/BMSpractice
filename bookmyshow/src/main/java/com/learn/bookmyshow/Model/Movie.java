package com.learn.bookmyshow.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter @Entity
public class Movie extends BaseModel {
    @OneToOne
    private String movieName;
    @ManyToMany
    private List<Actors> actors;

}
