package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class PipeDto {
    private String material;         // e.g., PVC, Steel, Copper
    private double diameter;         // Diameter in inches or mm
    private double length;           // Length in meters
    private boolean isFlexible;
    private String type;             // e.g., Water Pipe, Drainage Pipe
    private String color;
    private double weight;           // Weight in kg
    private boolean isCorrosionResistant;
}
