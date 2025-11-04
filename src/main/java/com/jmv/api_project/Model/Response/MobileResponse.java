package com.jmv.api_project.Model.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MobileResponse {
    @JsonProperty("id")
    private Long mobileId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("data")
    private MobileData mobileData;
}
