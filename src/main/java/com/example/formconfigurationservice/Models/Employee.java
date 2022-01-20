package com.example.formconfigurationservice.Models;

import com.sun.tools.javac.util.List;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.Map;

@NoArgsConstructor
@Document
public class Employee {

    @Id
    private String id;
    private String formName;
    private Map<String, String> sattelite; // убогий словарь
    private List<Field> field;             // убогий список


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormName(String formName) {
        return this.formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public Employee(String formName) {
        this.formName = formName;
    }

    public Map<String, String> getSattelite() {
        return sattelite;
    }

    public Employee(String id, String formName, List<Field> field, Map<String, String> sattelite) {
        this.id = null;
        this.formName = formName;
        this.sattelite = sattelite;
        this.field = field;
    }

}
