package com.asteroids.model;

import java.util.Date;

public class AsteroidDetails {

    private String name;

    private String neoRefId;

    private String nasaJplUrl;

    private Double absoluteMagnitudeH;

    private Double estimatedDiameterMin;

    private Double estimatedDiameterMax;

    private Boolean isPotentiallyHazardous;

    private String orbitingBody;

    private Date closeApproachDateTime;

    private Double velocityInKilometersPerHour;

    private Double missDistanceInKilometer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNeoRefId() {
        return neoRefId;
    }

    public void setNeoRefId(String neoRefId) {
        this.neoRefId = neoRefId;
    }

    public String getNasaJplUrl() {
        return nasaJplUrl;
    }

    public void setNasaJplUrl(String nasaJplUrl) {
        this.nasaJplUrl = nasaJplUrl;
    }

    public Double getAbsoluteMagnitudeH() {
        return absoluteMagnitudeH;
    }

    public void setAbsoluteMagnitudeH(Double absoluteMagnitudeH) {
        this.absoluteMagnitudeH = absoluteMagnitudeH;
    }

    public Double getEstimatedDiameterMin() {
        return estimatedDiameterMin;
    }

    public void setEstimatedDiameterMin(Double estimatedDiameterMin) {
        this.estimatedDiameterMin = estimatedDiameterMin;
    }

    public Double getEstimatedDiameterMax() {
        return estimatedDiameterMax;
    }

    public void setEstimatedDiameterMax(Double estimatedDiameterMax) {
        this.estimatedDiameterMax = estimatedDiameterMax;
    }

    public Boolean getPotentiallyHazardous() {
        return isPotentiallyHazardous;
    }

    public void setPotentiallyHazardous(Boolean potentiallyHazardous) {
        isPotentiallyHazardous = potentiallyHazardous;
    }

    public String getOrbitingBody() {
        return orbitingBody;
    }

    public void setOrbitingBody(String orbitingBody) {
        this.orbitingBody = orbitingBody;
    }

    public Date getCloseApproachDateTime() {
        return closeApproachDateTime;
    }

    public void setCloseApproachDateTime(Date closeApproachDateTime) {
        this.closeApproachDateTime = closeApproachDateTime;
    }

    public Double getVelocityInKilometersPerHour() {
        return velocityInKilometersPerHour;
    }

    public void setVelocityInKilometersPerHour(Double velocityInKilometersPerHour) {
        this.velocityInKilometersPerHour = velocityInKilometersPerHour;
    }

    public Double getMissDistanceInKilometer() {
        return missDistanceInKilometer;
    }

    public void setMissDistanceInKilometer(Double missDistanceInKilometer) {
        this.missDistanceInKilometer = missDistanceInKilometer;
    }
}
