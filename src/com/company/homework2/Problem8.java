package com.company.homework2;

import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args) {

        System.out.println("------------MENU-----------");
        System.out.println("-- enter 1 for calculating area of the circle");
        System.out.println("-- enter 2 for calculating perimeter of the circle");
        System.out.println("-- enter 3 for exit.");

        Scanner scanner = new Scanner(System.in);

        int action = scanner.nextInt();
        int radius = 5;

        if (action == 1) {
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println(area);

        } else if (action == 2) {
            double perimeter = 2 * Math.PI * radius;
            System.out.println(perimeter);

        } else if (action == 3) {
            System.out.println("exit");

        } else {
            System.out.println("unknown action");
        }
    }

}

