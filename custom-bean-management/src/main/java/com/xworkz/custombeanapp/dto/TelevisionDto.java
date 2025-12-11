package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class TelevisionDto {
    private String brand;
    private double screenSize;       // Screen size in inches
    private String resolution;       // e.g., 1080p, 4K, 8K
    private boolean isSmartTV;
    private String color;
    private double price;            // Price in USD
    private String displayType;      // e.g., LED, OLED, QLED
    private int hdmiPorts;
}
