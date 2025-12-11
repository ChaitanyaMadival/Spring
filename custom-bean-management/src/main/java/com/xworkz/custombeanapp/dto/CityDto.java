package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class CityDto {
    private String name;
    private String country;
    private int population;
    private double area;            // Area in square kilometers
    private String timezone;
    private boolean isCapital;
    private String famousLandmark;
    private String mayor;
}
