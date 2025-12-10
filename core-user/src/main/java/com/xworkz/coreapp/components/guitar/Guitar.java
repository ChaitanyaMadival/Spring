package com.xworkz.coreapp.components.guitar;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Guitar {

    @Value("1")
    private int guitarId;

    @Value("Black")
    private String colour;
}
