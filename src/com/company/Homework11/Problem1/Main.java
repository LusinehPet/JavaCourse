package com.company.Homework11.Problem1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String commandAsString = scanner.nextLine();


        String[] array = commandAsString.split(":");
        String drinkAsString = array[0];
        int sugarCount = Integer.parseInt(array[1]);
        DrinkType drinkType;
        if (drinkAsString.equals("T") || drinkAsString.equals("t")) {
            drinkType = DrinkType.TEA;
        } else if (drinkAsString.equals("C") || drinkAsString.equals("c")) {
            drinkType = DrinkType.COFFEE;
        } else {
            System.out.println("Invalid drink type");
            return;
        }
        Command command = new Command(drinkType, sugarCount);
        Drink drink = CoffeeMachine.makeDrink(command);
        System.out.println(drink);
    }
}

