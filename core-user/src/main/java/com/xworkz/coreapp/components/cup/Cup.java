package com.xworkz.coreapp.components.cup;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Cup {

    @Value("1")
    private int cupId;

    @Value("99.9")
    private double price;
}
