package com.xworkz.custombeanapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class WeaponDto {
    private String name;           // Name of the weapon
    private String type;           // Type of weapon (e.g., Gun, Sword, etc.)
    private double weight;         // Weight of the weapon in kilograms
    private double damage;         // Damage inflicted by the weapon
    private double range;          // Range of the weapon (in meters)
    private boolean isRanged;      // Whether the weapon is ranged or melee
    private String material;       // Material the weapon is made of (e.g., Steel, Wood, etc.)
    private int durability;
}
