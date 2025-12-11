package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class MicrowaveDto {
    private String brand;
    private double capacity;        // Capacity in liters
    private String type;            // e.g., Solo, Convection, Grill
    private int power;              // Power in watts
    private String color;
    private boolean hasGrillFunction;
    private boolean isInverter;
    private double price;
}
