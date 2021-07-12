package com.sda.javafundamentals.generics.model;

public class MobilePhone implements Identifiable{
    private String IMEI;
    private String model;

    @Override
    public String getId() {
        return IMEI;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
