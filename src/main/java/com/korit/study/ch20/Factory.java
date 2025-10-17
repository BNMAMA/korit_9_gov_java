package com.korit.study.ch20;

public class Factory {
    private static int id;
    private String name;


    public Factory(String name) {
        this.name = name;
    }

    public static Product createProduct(String name) {
        return new Product(++id, name);
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                '}';
    }
}
