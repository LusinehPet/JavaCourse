package com.company.Homework11.Problem1;

public class Tea extends Drink {

    public Tea(int sugarCount, boolean hasMilk, StickType stickType) {
        super(sugarCount,hasMilk, stickType);
    }

    @Override
    public String toString() {
        return "Your drink is tea, " +
                "sugarCount = " + getSugarCount()
                + ", hasMilk = " + hasMilk()
                + ", stick = " + getStickType();
    }
}
