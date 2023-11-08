package com.harper.asteroids.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EstimatedDiameter {

    @JsonProperty("kilometers")
    private DiameterEstimation kilometers;

    @JsonProperty("meters")
    private DiameterEstimation meters;

    @JsonProperty("miles")
    private DiameterEstimation miles;

    @JsonProperty("feet")
    private DiameterEstimation feet;

    public DiameterEstimation getKilometers() {
        return kilometers;
    }

    public DiameterEstimation getMeters() {
        return meters;
    }

    public DiameterEstimation getMiles() {
        return miles;
    }

    public DiameterEstimation getFeet() {
        return feet;
    }
}
