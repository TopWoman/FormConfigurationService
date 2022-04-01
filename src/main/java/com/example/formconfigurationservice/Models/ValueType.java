package com.example.formconfigurationservice.Models;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
public class ValueType {

    private EnumNumber type;
    private Map<String, String> valueModel;
    private List<Integer> defaultValue;
    private Integer min;
    private Integer max;
    private String alternativeDisplayExpr;

    @Id
    private String alternativeDisplayId;

    private ArrayList<Dict> dict;
    private String externSource;

    public EnumNumber getType() { return type; }
    public void setType(EnumNumber type) { this.type = type; }

    public Map<String, String> getValueModel() { return valueModel; }
    public void setValueModel(Map<String, String> valueModel) { this.valueModel = valueModel; }

    public List<Integer> getDefaultValue() { return defaultValue; }
    public void setDefaultValue(List<Integer> defaultValue) { this.defaultValue = defaultValue; }

    public Integer getMin() { return min; }
    public void setMin(Integer min) { this.min = min; }

    public Integer getMax() { return max; }
    public void setMax(Integer max) { this.max = max; }

    public String getAlternativeDisplayExpr() { return alternativeDisplayExpr; }
    public void setAlternativeDisplayExpr(String alternativeDisplayExpr) { this.alternativeDisplayExpr = alternativeDisplayExpr; }

    public String getAlternativeDisplayId() { return alternativeDisplayId; }
    public void setAlternativeDisplayId(String alternativeDisplayId) { this.alternativeDisplayId = alternativeDisplayId; }

    public ArrayList<Dict> getDict() { return dict; }
    public void setDict(ArrayList<Dict> dict) { this.dict = dict; }

    public String getExternSource() { return externSource; }
    public void setExternSource(String externSource) { this.externSource = externSource; }

}
