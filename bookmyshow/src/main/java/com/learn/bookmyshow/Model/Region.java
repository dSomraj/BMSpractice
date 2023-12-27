package com.learn.bookmyshow.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter @Entity
public class Region extends BaseModel {

    @OneToMany
    private List<Theater> theaters;
    private String city;
    private String state;
}
