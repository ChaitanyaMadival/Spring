package com.xworkz.coreapp.components.chair;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Chair {
    @Value("Brown")
    private String chairColour;

    @Value("150.0")
    private double price;
}
