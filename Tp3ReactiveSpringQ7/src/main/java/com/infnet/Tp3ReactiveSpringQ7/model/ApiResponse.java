package com.infnet.Tp3ReactiveSpringQ7.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ApiResponse {
    @JsonProperty("data_day")
    private DataDay dataDay;
}
