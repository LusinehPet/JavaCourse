package com.company.homework6;

import java.util.Random;

public class Problem1 {

    public static void main(String[] args) {

        Random random = new Random();

        int number1 = random.nextInt();
        int number2 = random.nextInt();

        System.out.println(calculateTheSum(number1,number2));
    }

    public static int calculateTheSum(int number1, int number2) {
        return number1 + number2;
    }
}
