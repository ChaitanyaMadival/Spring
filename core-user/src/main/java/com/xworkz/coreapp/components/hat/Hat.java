package com.xworkz.coreapp.components.hat;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class Hat {

    @Value("3")
    private int hatId;

    @Value("99.5")
    private double price;
}
