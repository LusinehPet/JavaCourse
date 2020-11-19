package com.company.homework6;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println(productOfNumbers(number1, number2));
    }

    public static int productOfNumbers(int a, int b) {
        return a * b;
    }
}
