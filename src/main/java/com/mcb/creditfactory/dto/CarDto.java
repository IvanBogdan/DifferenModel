package com.mcb.creditfactory.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.mcb.creditfactory.model.CarAssessment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeName("car")
public class CarDto implements Collateral {
    // Обьет приходит из вне в БД или считывается из БД
    private Long id;
    private String brand;
    private String model;
    private Double power;
    private Short year;
    private List<CarAssessment> values;
}
