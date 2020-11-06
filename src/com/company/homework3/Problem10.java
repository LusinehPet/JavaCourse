package com.company.homework3;

import java.util.Scanner;

public class Problem10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " X " + i + " = " + number * i);
        }
    }
}
