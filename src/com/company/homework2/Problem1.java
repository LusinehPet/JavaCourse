
package com.company.homework2;


import java.util.Random;

public class Problem1 {


    public static void main(String[] args) {

        Random random = new Random();

        int number1 = random.nextInt(91) + 10;
        int number2 = random.nextInt(91) + 10;
        int sum = number1 + number2;

        System.out.println((long) sum);

    }
}
