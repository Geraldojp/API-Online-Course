package com.example.belajar_spring.utils.specification;

import com.example.belajar_spring.utils.constatns.FindOperator;

public class SearchCriteria {
    private String key;
    private FindOperator operator;
    private String value;

    public SearchCriteria(String key, FindOperator operator, String value) {
        this.key = key;
        this.operator = operator;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public FindOperator getOperator() {
        return operator;
    }

    public void setOperator(FindOperator operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
