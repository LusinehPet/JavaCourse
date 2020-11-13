package com.company.homework3;

import java.util.Scanner;

public class Problem13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= number; j++) {
                if (j % 2 == i % 2) {
                    System.out.print(" black ");
                } else {
                    System.out.print(" white ");
                }
            }
            System.out.println();
        }
    }
}