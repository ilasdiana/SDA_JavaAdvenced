package com.sda.javafundamentals.billApp;

public enum CurrencyType {
    EUR("Euro"),
    USD("Dollar"),
    RON("Leu");

    CurrencyType(String prettyName) {
        this.prettyName = prettyName;
    }

    @Override
    public String toString() {
        return prettyName;
    }

    private String prettyName;
}
