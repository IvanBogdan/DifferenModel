package com.mcb.creditfactory.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class Assessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "assessed_value")
    private BigDecimal value;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime date;
}
