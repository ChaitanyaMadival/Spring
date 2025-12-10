package com.xworkz.coreapp.components.shoes;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Shoes {
    @Value("Nike")
    private String shoeBrand;

    @Value("4999.9")
    private double price;
}
