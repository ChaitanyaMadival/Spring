package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class WatchDto {
    private String brand;
    private String type;             // e.g., Analog, Digital, Smartwatch
    private String batteryLife;
    private String material;
    private boolean hasGPS;
    private double price;
    private String color;
    private boolean isWaterResistant;
}
