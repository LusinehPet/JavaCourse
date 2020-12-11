package com.company.Homework11.Problem1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String commandAsString = scanner.nextLine();


        String[] array = commandAsString.split(":");

        String drinkAsString = array[0];
        DrinkType drinkType;
        if (drinkAsString.equals("T") || drinkAsString.equals("t")) {
            drinkType = DrinkType.TEA;
        } else if (drinkAsString.equals("C") || drinkAsString.equals("c")) {
            drinkType = DrinkType.COFFEE;
        } else {
            System.out.println("Invalid drink type");
            return;
        }

        String milkAsString = array[2];
        boolean includeMilk;
        if (milkAsString.equals("0")) {
            includeMilk = false;
        } else if (milkAsString.equals("1")) {
           includeMilk = true;
        } else {
            System.out.println("Invalid argument for milk");
            return;
        }

        int sugarCount = Integer.parseInt(array[1]);
        Command command = new Command(drinkType, sugarCount, includeMilk);
        Drink drink = CoffeeMachine.makeDrink(command);
        System.out.println(drink);
    }
}

