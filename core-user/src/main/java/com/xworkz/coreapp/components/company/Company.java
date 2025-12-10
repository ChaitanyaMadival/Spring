package com.xworkz.coreapp.components.company;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Company {

    @Value("45")
    private int companyId;

    @Value("WhiteField")
    private String location;
}
