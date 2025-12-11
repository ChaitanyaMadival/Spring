package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class ShampooDto {
    private String brand;
    private String type;             // e.g., Anti-dandruff, Moisturizing
    private double volume;           // Volume in ml
    private String ingredients;
    private String fragrance;
    private boolean isSulfateFree;
    private double price;            // Price in USD
    private String packaging;
}
