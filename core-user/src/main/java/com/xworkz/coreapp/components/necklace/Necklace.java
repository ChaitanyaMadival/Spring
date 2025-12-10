package com.xworkz.coreapp.components.necklace;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Necklace {

    @Value("19")
    private int necklaceId;

    @Value("97999.9")
    private double price;
}
