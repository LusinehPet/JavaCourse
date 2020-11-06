package com.company.homework3;

import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {

            sum += scanner.nextInt();

        }
        int average = sum / 10;
        System.out.println(sum);
        System.out.println(average);
    }
}