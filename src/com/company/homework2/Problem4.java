package com.company.homework2;

import java.util.Random;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();


        if (number > 100) {
            int random1 = random.nextInt(number - 49) + 50;

            String randomAsString = String.valueOf(random1);
            System.out.println(randomAsString);

        } else if (number < 100) {
            int random2 = random.nextInt(51);

            String randomAsString = String.valueOf(random2);
            System.out.println(randomAsString);
        }

    }
}
