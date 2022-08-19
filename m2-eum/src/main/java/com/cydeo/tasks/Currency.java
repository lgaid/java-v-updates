package com.cydeo.tasks;

public enum Currency {

    PENNY(1),NICKEL(5),DIME(10),QUARTER(25);

    private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }



}