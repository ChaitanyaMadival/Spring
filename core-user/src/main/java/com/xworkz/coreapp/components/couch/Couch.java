package com.xworkz.coreapp.components.couch;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Couch {
    @Value("1")
    private int couchId;

    @Value("Devendra Singh Chauhan(Dev)")
    private String name;
}
