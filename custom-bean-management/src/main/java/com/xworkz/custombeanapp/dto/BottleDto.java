package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class BottleDto {
    private String brand;
    private String model;
    private double power;           // Power in watts
    private double capacity;           // Capacity in liters
    private String color;
    private boolean isCordless;
    private int speedSettings;
    private String material;
}
