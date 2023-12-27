package com.learn.bookmyshow.Repository;

import com.learn.bookmyshow.Model.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShowRepository extends JpaRepository<Show,Long> {
    @Override
    Optional<Show> findById(Long aLong);
}
