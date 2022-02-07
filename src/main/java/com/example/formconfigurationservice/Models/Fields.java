package com.example.formconfigurationservice.Models;

import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Map;

public class Fields {

    @Id
    private ObjectId id;

    private Map<String, String> editorType;
    private String label;
    private ValueType valueType;
    private String destinationField;

    public Fields() {
        this.id = ObjectId.get();
    }

    public ObjectId getId() {
        return id;
    }
    public void setId(ObjectId id) {
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

    public String getDestinationField() { return destinationField; }
    public void setDestinationField(String destinationField) { this.destinationField = destinationField; }

}
