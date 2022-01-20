package com.example.formconfigurationservice.Models;

import java.util.Map;

public class Satellite {

    private Map<String, String> satelliteType;
    private Map<String, String> satelliteClassifier;

    public Map<String, String> getSatelliteType() { return satelliteType; }
    public void setSatelliteType(Map<String, String> satelliteType) { this.satelliteType = satelliteType; }

    public Map<String, String> getSatelliteClassifier() { return satelliteClassifier; }
    public void setSatelliteClassifier(Map<String, String> satelliteClassifier) { this.satelliteClassifier = satelliteClassifier; }
}
