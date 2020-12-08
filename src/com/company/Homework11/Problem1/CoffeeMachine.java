package com.company.Homework11.Problem1;

public class CoffeeMachine {

    public static Drink makeDrink(Command command) {
        if (command.getDrinkType() == DrinkType.TEA) {
            return new Tea(command.getSugarCount());
        } else {
            return new Coffee(command.getSugarCount());
        }
    }
}
