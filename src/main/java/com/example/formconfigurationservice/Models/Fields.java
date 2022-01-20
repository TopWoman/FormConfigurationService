package com.example.formconfigurationservice.Models;

import java.util.Map;

public class Fields {

    private Map<String, String> type;
    private Map<String, String> valueType;
    private Map<String, String> defaultValue;
    private Map<String, String> label;

    public Map<String, String> getType() { return type; }
    public void setType(Map<String, String> type) { this.type = type; }

    public Map<String, String> getValueType() { return valueType; }
    public void setValueType(Map<String, String> valueType) { this.valueType = valueType; }

    public Map<String, String> getDefaultValue() { return defaultValue; }
    public void setDefaultValue(Map<String, String> defaultValue) { this.defaultValue = defaultValue; }

    public Map<String, String> getLabel() { return label; }
    public void setLabel(Map<String, String> label) { this.label = label; }

}
