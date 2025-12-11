package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class CompanyDto {
    private String name;
    private String industry;        // e.g., Technology, Manufacturing
    private String location;
    private int numberOfEmployees;
    private String ceo;
    private double annualRevenue;   // Revenue in USD
    private String contactNumber;
    private int establishedYear;
}
