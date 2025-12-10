package com.xworkz.coreapp.components.hotel;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Hotel {
    @Value("Rajajinagar")
    private String location;

    @Value("Smokey")
    private String name;
}
