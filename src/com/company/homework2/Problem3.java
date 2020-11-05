package com.company.homework2;

import java.util.Random;

public class Problem3 {

    public static void main(String[] args) {

        Random random = new Random();

        int number = random.nextInt(91) + 10;
        double square = Math.pow(number, 2);
        String squareAsString = String.valueOf(square);

        System.out.println(squareAsString);
    }
}