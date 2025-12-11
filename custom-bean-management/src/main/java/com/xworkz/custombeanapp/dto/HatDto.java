package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class HatDto {
    private String brand;
    private String type;            // e.g., Baseball Cap, Fedora, Beanie
    private String material;
    private String color;
    private double size;            // Size in cm or S/M/L
    private boolean isAdjustable;
    private boolean isWashable;
    private String design;
}
