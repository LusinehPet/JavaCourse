package com.company.homework2;

import java.util.Random;

public class Problem9 {

    public static void main(String[] args) {

        Random random = new Random();

        int number1 = random.nextInt(51) + 25;
        int number2 = random.nextInt(51) + 25;

        if (number1 / 10 == number2 / 10 || number1 / 10 == number2 % 10 ||
                number1 % 10 == number2 / 10 || number1 % 10 == number2 % 10) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }
    }
}
