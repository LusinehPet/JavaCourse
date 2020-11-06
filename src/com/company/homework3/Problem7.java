package com.company.homework3;

public class Problem7 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;

            }
        }
        int average = sum / 50;
        System.out.println(average);
    }
}