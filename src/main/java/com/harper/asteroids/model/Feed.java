package com.harper.asteroids.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Response for a feed query of Neos.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Feed {
    @JsonProperty("element_count")
    private int elementCount;

    @JsonProperty("near_earth_objects")
    private Map<String, List<NearEarthObject>> nearEarthObjects;

    public int getElementCount() {
        return elementCount;
    }

    public Map<String, List<NearEarthObject>> getNearEarthObjects() {
        return nearEarthObjects;
    }

    public List<NearEarthObject> getAllObjects() {
        return nearEarthObjects.values().stream()
                .flatMap(l -> l.stream())
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
