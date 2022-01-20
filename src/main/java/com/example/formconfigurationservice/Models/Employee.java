package com.example.formconfigurationservice.Models;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Document
public class Employee {

    @Id
    private String id;
    private String formName;
    private String label;
    private ArrayList<Satellite> satellite;       // убогий словарь
    private ArrayList<Fields> fields;            // убогий список

    public ArrayList<Fields> getFields() {
        return fields;
    }
    public void setFields(ArrayList<Fields> fields) {
        this.fields = fields;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public String getFormName() {
        return formName;
    }
    public void setFormName(String formName) {
        this.formName = formName;
    }

    public ArrayList<Satellite> getSatellite() {
        return satellite;
    }
    public void setSatellite(ArrayList<Satellite> satellite) {
        this.satellite = satellite;
    }

    public Employee(String formName) {
        this.formName = formName;
    }

    public Employee(String id, String formName, String label, ArrayList<Satellite> satellite, ArrayList<Fields> fields) {
        this.id = null;
        this.formName = formName;
        this.label = label;
        this.satellite = satellite;
        this.fields = fields;
    }

}
