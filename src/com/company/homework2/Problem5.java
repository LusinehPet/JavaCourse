package com.company.homework2;

import java.util.Random;
import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {

        Random random = new Random();

        int random1 = random.nextInt();
        int random2 = random.nextInt();

        Scanner scanner = new Scanner(System.in);

        String operator = scanner.next();

        switch (operator) {

            case "+":
                System.out.println(random1 + random2);
                break;
            case "-":
                System.out.println(random1 - random2);
                break;
            case "*":
                System.out.println(random1 * random2);
                break;
            case "/":
                System.out.println(random1 / random2);
                break;
            default:
                System.out.println("other");
        }

    }

}
