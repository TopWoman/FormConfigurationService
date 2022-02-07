package com.example.formconfigurationservice.Models;

import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Map;

public class Satellite {

    @Id
    private ObjectId id;

    public Satellite() {
        this.id = new ObjectId();
    }

    private Map<String, String> satelliteType;
    private Map<String, String> satelliteClassifier;

    public ObjectId getId() {
        return id;
    }
    public void setId(ObjectId id) {
        this.id = id;
    }

    public Map<String, String> getSatelliteType() { return satelliteType; }
    public void setSatelliteType(Map<String, String> satelliteType) { this.satelliteType = satelliteType; }

    public Map<String, String> getSatelliteClassifier() { return satelliteClassifier; }
    public void setSatelliteClassifier(Map<String, String> satelliteClassifier) { this.satelliteClassifier = satelliteClassifier; }

}
