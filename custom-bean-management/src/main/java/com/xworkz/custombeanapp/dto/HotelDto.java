package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class HotelDto {
    private String name;
    private String location;
    private int numberOfRooms;
    private double rating;          // Rating out of 5
    private String amenities;       // e.g., Wi-Fi, Pool, Spa
    private String owner;
    private String contactNumber;
    private boolean isPetFriendly;
}
