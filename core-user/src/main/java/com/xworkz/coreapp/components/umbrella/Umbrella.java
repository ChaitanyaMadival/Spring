package com.xworkz.coreapp.components.umbrella;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Umbrella {

    @Value("Black")
    private String colour;

    @Value("350.0")
    private double price;
}
