package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class CigaretteDto {
    private String brand;
    private String type;           // e.g., Regular, Menthol
    private double nicotineContent; // Nicotine content in mg
    private double packSize;        // Pack size in number of cigarettes
    private String flavor;
    private String packaging;       // e.g., Box, Soft Pack
    private boolean isMenthol;
    private int tarContent;
}
