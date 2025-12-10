package com.xworkz.coreapp.components.shirt;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Shirt {

    @Value("Black")
    private String colour;

    @Value("999.9")
    private double price;
}
