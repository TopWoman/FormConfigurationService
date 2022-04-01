package com.example.formconfigurationservice.Models;

import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Map;

public class Fields {

    @Id
    private String id;

    private Map<String, String> editorType;
    private String label;
    private ValueType valueType;
    private List<String> destinationField;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getEditorType() {
        return editorType;
    }
    public void setEditorType(Map<String, String> editorType) {
        this.editorType = editorType;
    }

    public ValueType getValueType() { return valueType; }
    public void setValueType(ValueType valueType) { this.valueType = valueType; }

    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }

    public List<String> getDestinationField() { return destinationField; }
    public void setDestinationField(List<String> destinationField) { this.destinationField = destinationField; }

}
