package com.company.Homework11.Problem1;

public class Coffee extends Drink {

    public Coffee(int sugarCount) {
        super(sugarCount);
    }

    @Override
    public String toString() {
        return "Your drink is coffee, sugarCount = " + getSugarCount();
    }
}
