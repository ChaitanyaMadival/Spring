package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class BlanketDto {
    private String color;
    private String material;
    private double weight; // Weight in kilograms
    private double sizeLength; // Length in meters
    private double sizeWidth;  // Width in meters
    private String brand;
    private boolean isWashable;
    private int warrantyPeriod;
}
