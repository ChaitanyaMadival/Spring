package com.xworkz.coreapp.components.brush;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Brush {

    @Value("21")
    private int brushId;

    @Value("Flexible")
    private String type;
}
