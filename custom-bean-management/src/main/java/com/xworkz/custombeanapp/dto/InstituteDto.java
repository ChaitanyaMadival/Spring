package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class InstituteDto {
    private String name;
    private String location;
    private String type;            // e.g., University, Training Institute
    private int numberOfStudents;
    private String headOfInstitute;
    private int establishedYear;
    private String contactNumber;
    private String coursesOffered;
}
