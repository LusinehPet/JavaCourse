package com.company.Homework11.Problem1;

public abstract class Drink {

    private int sugarCount;

    public Drink(int sugarCount) {
        this.sugarCount = sugarCount;
    }

    public int getSugarCount() {
        return sugarCount;
    }

    public void setSugarCount(int sugarCount) {
        this.sugarCount = sugarCount;
    }
}
