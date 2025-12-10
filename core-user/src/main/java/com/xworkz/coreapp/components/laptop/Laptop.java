package com.xworkz.coreapp.components.laptop;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class Laptop {

    @Value("HP")
    private String name;

    @Value("45999.9")
    private double price;
}
