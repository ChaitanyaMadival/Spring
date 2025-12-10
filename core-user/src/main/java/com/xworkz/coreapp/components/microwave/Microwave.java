package com.xworkz.coreapp.components.microwave;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Microwave {

    @Value("2")
    private String microwaveId;

    @Value("23300.0")
    private double price;
}
