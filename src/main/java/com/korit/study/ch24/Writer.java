package com.korit.study.ch24;

import java.util.Objects;

public class Writer {
    private String name;
    private int age;

    public Writer() {

    }


    public Writer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Writer writer = (Writer) o;
        return age == writer.age && Objects.equals(name, writer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
