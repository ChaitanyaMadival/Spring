package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class CupDto {
    private String material;        // e.g., Ceramic, Plastic, Metal
    private String brand;
    private String color;
    private double capacity;        // Capacity in ml
    private String design;
    private boolean isInsulated;
    private boolean isDishwasherSafe;
    private boolean hasHandle;
}
