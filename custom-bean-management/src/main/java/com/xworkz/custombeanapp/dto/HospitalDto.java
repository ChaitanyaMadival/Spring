package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class HospitalDto {
    private int hospitalId;
    private String name;
    private int totalNumberOfBeds;
    private String location;
    private String type;
    private int icuBeds;
    private String contactNumber;
    private boolean isOpenDayAndNight;
}
