package com.korit.study.ch23;

public class NonGeneric {
    private Object data;

    public NonGeneric(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "NonGeneric{" +
                "data='" + data + '\'' +
                '}';
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
