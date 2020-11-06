package com.company.homework3;

import java.util.Scanner;

public class Problem12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int prePrevious = 0;
        int previous = 1;
        for (int i = 0; i < number; i++) {
            int next = prePrevious + previous;
            System.out.println(next);
            prePrevious = previous;
            previous = next;
        }
    }
}
