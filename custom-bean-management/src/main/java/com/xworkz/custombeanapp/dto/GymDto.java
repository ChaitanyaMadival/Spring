package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class GymDto {
    private String name;
    private String location;
    private int numberOfMachines;
    private int numberOfMembers;
    private String membershipPlans;
    private String trainerName;
    private boolean hasSwimmingPool;
    private boolean hasPersonalTraining;
}
