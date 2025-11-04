package com.jmv.api_project.Model.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MobileData {
    @JsonProperty("color")
    private String color;

    @JsonProperty("Color")
    private String Color;

    @JsonProperty("Strap Colour")
    private String Strap_colour;

    @JsonProperty("capacity")
    private String capacity;

    @JsonProperty("Capacity")
    private String Capacity;

    @JsonProperty("capacity GB")
    private String capacityGB;

    @JsonProperty("price")
    private Double price;

    @JsonProperty("generation")
    private String generation;

    @JsonProperty("year")
    private Integer year;

    @JsonProperty("CPU model")
    private String CPU_model;

    @JsonProperty("Hard disk size")
    private String Hard_disk_size;

    @JsonProperty("Case Size")
    private String Case_size;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Screen size")
    private Double screenSize;
}
