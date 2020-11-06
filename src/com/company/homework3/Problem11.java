package com.company.homework3;

import java.util.Scanner;

public class Problem11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}

