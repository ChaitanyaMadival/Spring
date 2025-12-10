package com.xworkz.coreapp.components.shampoo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Shampoo {

    @Value("1")
    private int shampooId;

    @Value("Love Beauty Planet")
    private String name;
}
