package com.company.Homework11.Problem1;

public class Coffee extends Drink {

    public Coffee(int sugarCount, boolean hasMilk, StickType stickType) {
        super(sugarCount, hasMilk, stickType);
    }

    @Override
    public String toString() {
        return "Your drink is coffee, " +
                "sugarCount = " + getSugarCount()
                + ", hasMilk = " + hasMilk()
                + ", stick = " + getStickType();
    }
}
