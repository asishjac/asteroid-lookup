package com.asteroids.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Distances implements Comparable<Distances> {

    @JsonProperty("astronomical")
    private Double astronomical;

    @JsonProperty("lunar")
    private Double lunar;

    @JsonProperty("kilometers")
    private Double kilometers;

    @JsonProperty("miles")
    private Double miles;

    public Double getAstronomical() {
        return astronomical;
    }

    public Double getLunar() {
        return lunar;
    }

    public Double getKilometers() {
        return kilometers;
    }

    public Double getMiles() {
        return miles;
    }


    @Override
    public int compareTo(Distances other) {
        return kilometers.compareTo(other.getKilometers());
    }
}
