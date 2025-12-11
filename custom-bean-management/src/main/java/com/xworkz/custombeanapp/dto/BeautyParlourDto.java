package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class BeautyParlourDto {
    private String name;
    private String location;
    private String servicesOffered;
    private double rating;
    private boolean isSpaAvailable;
    private int numberOfEmployees;
    private String owner;
    private String contactNumber;
}
