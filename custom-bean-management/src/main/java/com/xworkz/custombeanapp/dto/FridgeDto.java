package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class FridgeDto {
    private String brand;
    private double capacity;        // Capacity in liters
    private String type;            // e.g., Double Door, Single Door, Side by Side
    private String color;
    private boolean isFrostFree;
    private boolean hasFreezer;
    private double energyRating;    // Energy rating in stars
    private String material;
}
