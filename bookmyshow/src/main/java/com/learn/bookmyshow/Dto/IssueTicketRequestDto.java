package com.learn.bookmyshow.Dto;

import com.learn.bookmyshow.Model.ShowSeat;
import com.learn.bookmyshow.Model.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Locale;

@Getter @Setter
public class IssueTicketRequestDto {
    private List<Long> showSeatsId;
    private Long userId;
    private Long showId;
}
