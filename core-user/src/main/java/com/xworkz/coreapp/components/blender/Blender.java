package com.xworkz.coreapp.components.blender;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class Blender {

    @Value("7")
    private int blenderId;

    @Value("Prestige")
    private String brand;
}
