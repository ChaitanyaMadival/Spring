package com.xworkz.coreapp.components.fridge;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Fridge {

    @Value("Blue")
    private String colour;

    @Value("89999.9")
    private double price;
}
