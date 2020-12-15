package com.company.Homework13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();

        while (true) {
            Command command = readCommand();
            if (command != null) {
                ArrayList<Product> products = vendingMachine.getProducts(command);
                if (products == null) {
                    System.out.println("Not enough products");
                } else {
                    System.out.println(products);
                }
            }
        }
    }

    private static Command readCommand() {
        Scanner scanner = new Scanner(System.in);
        String commandAsString = scanner.nextLine();

        String[] array = commandAsString.split(":");
        String lineAsString = array[0];
        if (lineAsString.length() != 1) {
            System.out.println("Invalid Row length");
            return null;
        }
        char row = lineAsString.charAt(0);
        if (row < 'A' || row > 'F') {
            System.out.println("Invalid Row command");
            return null;
        }
        int productPlace = Integer.parseInt(array[1]);

        int productCount = Integer.parseInt(array[2]);

        return new Command(row, productPlace, productCount);
    }
}
