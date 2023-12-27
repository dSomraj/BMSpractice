package com.learn.bookmyshow.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter @Entity
public class Theater extends BaseModel {

    private Region region;

    @OneToMany
    private List<Screen> screens;
}
