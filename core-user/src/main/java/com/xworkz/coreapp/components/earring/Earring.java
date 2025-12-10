package com.xworkz.coreapp.components.earring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Earring {

    @Value("Metal")
    private String type;

    @Value("119.9")
    private double price;
}
