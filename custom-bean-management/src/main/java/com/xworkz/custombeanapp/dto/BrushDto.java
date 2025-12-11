package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class BrushDto {
    private String brand;
    private String type;        // e.g., Toothbrush, Paintbrush, Hairbrush, etc.
    private int bristleLength;  // Length of bristles in mm
    private String bristleMaterial; // e.g., Nylon, Natural, etc.
    private String handleMaterial; // e.g., Plastic, Wood, etc.
    private String color;
    private boolean isReusable;
    private String design;
}
