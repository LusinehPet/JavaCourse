package com.company.homework4;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        int[] array = {3, 5, 8, 2, 6, 8, 1, 32};

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("wrong number, please try again");
    }
}
