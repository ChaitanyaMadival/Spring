package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class ChocolateDto {
    private String brand;
    private String type;        // e.g., Dark, Milk, White
    private double weight;       // Weight in grams
    private String flavor;       // e.g., Almond, Hazelnut, Mint, etc.
    private boolean isSugarFree;
    private boolean isVegan;
    private String packaging;    // e.g., Wrapper, Box, etc.
    private int cocoaPercentage;
}
