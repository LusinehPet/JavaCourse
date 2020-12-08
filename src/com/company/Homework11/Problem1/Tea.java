package com.company.Homework11.Problem1;

import com.company.Homework11.Problem1.Drink;

public class Tea extends Drink {

    public Tea(int sugarCount) {
        super(sugarCount);
    }

    @Override
    public String toString() {
        return "Your drink is tea, sugarCount = " + getSugarCount();
    }
}
