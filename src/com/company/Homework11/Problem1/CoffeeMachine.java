package com.company.Homework11.Problem1;

import java.util.Random;

public class CoffeeMachine {

    public static Drink makeDrink(Command command) {

        StickType stickType;
        if (command.getSugarCount() == 0) {
            stickType = null;
        } else {
            Random random = new Random();
            if (random.nextInt(2) == 0) {
                stickType = StickType.PLASTIC;
            } else {
                stickType = StickType.WOODEN;
            }
        }

        if (command.getDrinkType() == DrinkType.TEA) {
            return new Tea(command.getSugarCount(), command.isIncludeMilk(),stickType);
        } else {
            return new Coffee(command.getSugarCount(), command.isIncludeMilk(),stickType);
        }
    }
}
