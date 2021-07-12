package com.sda.javafundamentals.generics.model;

public class Person implements  Identifiable{

    private String CNP;
    private String name;
    private  int age;

    @Override
    public String getId() {
        return CNP;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
