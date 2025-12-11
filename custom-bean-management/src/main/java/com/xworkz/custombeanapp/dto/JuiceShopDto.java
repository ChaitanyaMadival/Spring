package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class JuiceShopDto {
    private String name;
    private String location;
    private String menu;            // e.g., Fruit Juices, Smoothies, Shakes
    private double averagePrice;    // Average price per item
    private String owner;
    private String contactNumber;
    private boolean hasDeliveryService;
    private boolean isOrganic;
}
