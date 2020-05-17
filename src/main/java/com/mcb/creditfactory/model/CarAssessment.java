package com.mcb.creditfactory.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "CAR_ASSESSMENT")
public class CarAssessment extends Assessment {

    @ManyToOne
    @JoinColumn(name = "collateral_id")
    @JsonIgnore
    private Car collateral;
}
