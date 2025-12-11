package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class ChairDto {

    private String brand;
    private String type;        // e.g., Office Chair, Dining Chair, Lounge Chair
    private String material;     // e.g., Wood, Metal, Plastic, etc.
    private boolean isAdjustable;
    private String color;
    private int weightCapacity;  // Maximum weight the chair can hold
    private boolean hasArmrests;
    private double height;
}
