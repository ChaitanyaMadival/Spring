package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class LaptopDto {
    private String brand;
    private String model;
    private String processor;       // e.g., Intel i7, AMD Ryzen 5
    private double ramSize;         // RAM size in GB
    private double storageSize;     // Storage size in GB
    private double screenSize;      // Screen size in inches
    private String operatingSystem; // e.g., Windows, macOS, Linux
    private double price;
}
