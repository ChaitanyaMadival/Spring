package com.xworkz.coreapp.components.comb;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Comb {
    @Value("Woden")
    private String type;

    @Value("100")
    private double price;
}
