package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class CouchDto {
    private String brand;
    private String material;        // e.g., Leather, Fabric
    private String color;
    private int numberOfSeats;
    private boolean hasRecliner;
    private String design;          // e.g., Modern, Vintage
    private double length;          // Length in cm
    private double width;
}
