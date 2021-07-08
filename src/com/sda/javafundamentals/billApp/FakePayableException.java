package com.sda.javafundamentals.billApp;

public class FakePayableException extends Exception {
    private PayableType payableType;

    public FakePayableException(PayableType payableType) {
        super("This payable is fake!");
        this.payableType = payableType;
    }

    public PayableType getPayableType() {
        return payableType;
    }
}
