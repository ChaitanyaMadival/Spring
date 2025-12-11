package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class FanDto {
    private String brand;
    private String type;            // e.g., Ceiling Fan, Stand Fan, Table Fan
    private int speedSettings;
    private double power;           // Power consumption in watts
    private String color;
    private boolean hasRemoteControl;
    private boolean isOscillating;
    private int size;
}
