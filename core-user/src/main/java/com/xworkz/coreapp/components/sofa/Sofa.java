package com.xworkz.coreapp.components.sofa;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class Sofa {
    @Value("Maroon")
    private String colour;

    @Value("25000.9")
    private double price;
}
