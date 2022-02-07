package com.example.formconfigurationservice.Models;

import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
public class ValueType {

    private String type;
    private Map<String, String> valueModel;
    private String defaultValue;

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Map<String, String> getValueModel() { return valueModel; }
    public void setValueModel(Map<String, String> valueModel) { this.valueModel = valueModel; }

    public String getDefaultValue() { return defaultValue; }
    public void setDefaultValue(String defaultValue) { this.defaultValue = defaultValue; }

}
