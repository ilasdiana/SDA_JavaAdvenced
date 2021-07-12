package com.sda.javafundamentals.generics.model;

public class Car implements Identifiable{

    private String VIN;
    private String color;


    @Override
    public String getId() {
        return VIN;
    }

    @Override
    public String toString() {
        return "Car{" +
                "VIN='" + VIN + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
