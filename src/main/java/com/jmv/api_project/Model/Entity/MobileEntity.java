package com.jmv.api_project.Model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "MOBILE_INFO")
public class MobileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mobileId;
    private String name;
    private String color;
    private String Color_2;
    private String Strap_colour;
    private String capacity;
    private String Capacity_2;
    private String capacityGB;
    private Double price;
    private String generation;
    private Integer year;
    private String CPU_model;
    private String Hard_disk_size;
    private String Case_size;
    private String description;
    private Double screenSize;
}
