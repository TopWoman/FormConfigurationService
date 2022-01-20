package com.example.formconfigurationservice.Models;

import com.example.formconfigurationservice.Enum.Field;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Document
public class Employee {

    @Id
    private String id;
    private String formName;
    private String label;
    private Map<String, String> sattelite; // убогий словарь
    private List<Field> fields;            // убогий список

    public List<Field> getField() {
        return fields;
    }
    public void setField(List<Field> fields) {
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

    public String getFormName(String formName) {
        return this.formName;
    }
    public void setFormName(String formName) {
        this.formName = formName;
    }

    public Map<String, String> getSattelite() {
        return sattelite;
    }
    public void setSattelite(Map<String, String> sattelite) {
        this.sattelite = sattelite;
    }

    public Employee(String formName) {
        this.formName = formName;
    }

    public Employee(String id, String formName, String label, Map<String, String> sattelite) {
        this.id = null;
        this.formName = formName;
        this.label = label;
        this.sattelite = sattelite;
    }

}
