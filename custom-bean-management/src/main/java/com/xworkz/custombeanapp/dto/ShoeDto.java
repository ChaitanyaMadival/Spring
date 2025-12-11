package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class ShoeDto {
    private String brand;
    private String type;             // e.g., Running Shoes, Casual Shoes
    private String material;         // e.g., Leather, Fabric, Synthetic
    private String color;
    private double size;             // Shoe size (US, UK, EU, etc.)
    private boolean isWaterResistant;
    private double price;            // Price in USD
    private boolean isAvailableInMultipleSizes;
}
