package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class SmartPhoneDto {
    private String brand;
    private String model;
    private String operatingSystem;  // e.g., Android, iOS
    private double screenSize;       // Screen size in inches
    private double batteryCapacity;  // Battery capacity in mAh
    private double price;            // Price in USD
    private int ramSize;             // RAM size in GB
    private int storageSize;
}
