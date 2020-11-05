package com.company.homework2;

import java.util.Random;

public class Problem2 {

    public static void main(String[] args) {

        Random random = new Random();
        int number1 = random.nextInt(91) + 10;
        int number2 = random.nextInt(91) + 10;
        int sum = number1 * number2;

        if (sum % 2 == 0) {
            System.out.println((long) sum);
        } else {
            System.out.println((double) sum);
        }
    }
}