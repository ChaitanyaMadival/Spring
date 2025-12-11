package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class PhotoStudioDto {
    private String name;
    private String location;
    private String servicesOffered;  // e.g., Photography, Editing, Printing
    private double hourlyRate;       // Rate per hour in USD
    private boolean hasOnlineBooking;
    private String contactNumber;
    private String ownerName;
    private boolean hasPhotoBooth;
}
