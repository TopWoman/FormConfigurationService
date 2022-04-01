package com.example.formconfigurationservice.Models;

import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Map;

public class Satellite {

    @Id
    private String id;
    private Map<String, String> satelliteType;
    private Map<String, String> satelliteClassifier;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getSatelliteType() { return satelliteType; }
    public void setSatelliteType(Map<String, String> satelliteType) { this.satelliteType = satelliteType; }

    public Map<String, String> getSatelliteClassifier() { return satelliteClassifier; }
    public void setSatelliteClassifier(Map<String, String> satelliteClassifier) { this.satelliteClassifier = satelliteClassifier; }

}
