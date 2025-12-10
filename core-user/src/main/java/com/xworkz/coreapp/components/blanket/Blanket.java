package com.xworkz.coreapp.components.blanket;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Blanket {
    @Value("Puma")
    private String blanketBrand;

    @Value("999.9")
    private double price;
}
