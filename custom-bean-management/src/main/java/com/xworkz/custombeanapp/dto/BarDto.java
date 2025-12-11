package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class BarDto {

    private String name;
    private String location;
    private String type;
    private double rating;
    private boolean hasLiveMusic;
    private int capacity;
    private String owner;
    private String contactNumber;
}
