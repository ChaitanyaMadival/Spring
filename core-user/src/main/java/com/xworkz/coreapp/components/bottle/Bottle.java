package com.xworkz.coreapp.components.bottle;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Bottle {

    @Value("Black")
    private String colour;

    @Value("350")
    private double price;
}
