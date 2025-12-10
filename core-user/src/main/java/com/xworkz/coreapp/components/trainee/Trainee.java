package com.xworkz.coreapp.components.trainee;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Trainee {
    @Value("21")
    private int traineeId;

    @Value("Chaitanya")
    private String name;
}
