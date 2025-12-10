package com.xworkz.coreapp.components.fan;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Fan {
    @Value("1")
    private String fanId;

    @Value("1099.9")
    private double price;

}
