package com.infnet.Tp3ReactiveSpringQ7.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MeteoResponse {
    private Double maxTemperature;
    private Double minTemperature;
}
