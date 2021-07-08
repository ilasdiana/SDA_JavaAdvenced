package com.sda.javafundamentals.billApp;

public interface PayableType {
    int getValue();

    CurrencyType getCurrency();

    boolean isFake();
}
