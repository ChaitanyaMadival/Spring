package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class ParkDto {
    private String name;
    private String location;
    private double area;            // Area in square meters
    private String openingHours;    // e.g., 6 AM - 10 PM
    private boolean hasPlayground;
    private boolean hasJoggingTrack;
    private int numberOfVisitors;
    private String amenities;
}
