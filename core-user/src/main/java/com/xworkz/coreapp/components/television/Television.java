package com.xworkz.coreapp.components.television;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Television {

    @Value("Samsung")
    private String televisionBrand;

    @Value("50099.9")
    private double price;
}
