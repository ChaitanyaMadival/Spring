package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class TraineeDto {
    private String name;
    private String course;           // e.g., Software Engineering, Marketing
    private int age;
    private String trainingCenter;
    private String mentorName;
    private String startDate;
    private String endDate;
    private String contactNumber;
}
