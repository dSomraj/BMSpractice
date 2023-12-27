package com.learn.bookmyshow.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@Getter @Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Id
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date createdAt;
    @Id
    @Temporal(value =TemporalType.TIMESTAMP)
    private Date LastModifiedAt;
}
