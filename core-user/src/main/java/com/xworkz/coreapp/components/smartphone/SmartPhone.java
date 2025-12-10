package com.xworkz.coreapp.components.smartphone;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class SmartPhone {
    @Value("143")
    private int phoneId;

    @Value("Apple")
    private String companyName;
}
