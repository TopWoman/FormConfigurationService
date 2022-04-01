package com.example.formconfigurationservice.Models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;

public class Dict {
    @Id
    private Integer id;


    private String label;
    private Integer value;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }
    public void  setLabel(String label) {
        this.label = label;
    }

    public Integer getValue() {
        return value;
    }
    public void setValue(Integer value) {
        this.value = value;
    }

}
