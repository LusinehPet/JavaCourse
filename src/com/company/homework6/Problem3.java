package com.company.homework6;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println(cubeOfProduct(number1, number2));
    }

    public static int productOfNumbers(int a, int b) {
        return a * b;
    }

    public static int cubeOfProduct(int a, int b) {
        return (int) Math.pow(productOfNumbers(a, b), 3);
    }
}

