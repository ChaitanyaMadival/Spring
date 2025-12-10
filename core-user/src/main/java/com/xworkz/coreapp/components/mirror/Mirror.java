package com.xworkz.coreapp.components.mirror;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Mirror {

    @Value("1")
    private int mirrorId;

    @Value("350.9")
    private double price;
}
