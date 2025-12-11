package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class PetrolBunkDto {
    private String name;
    private String location;
    private String fuelTypes;      // e.g., Petrol, Diesel, CNG
    private double fuelPrice;      // Price per liter in USD
    private boolean hasCarWash;
    private boolean hasConvenienceStore;
    private String operatingHours; // e.g., 24/7, 6 AM - 10 PM
    private String contactNumber;
}
