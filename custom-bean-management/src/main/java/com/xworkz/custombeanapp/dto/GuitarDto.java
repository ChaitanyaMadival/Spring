package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class GuitarDto {
    private String brand;
    private String type;            // e.g., Acoustic, Electric, Bass
    private String material;        // e.g., Wood, Metal
    private String color;
    private int numberOfStrings;
    private String bodyShape;       // e.g., Dreadnought, Stratocaster
    private boolean hasPickup;      // For Electric Guitars
    private double price;
}
