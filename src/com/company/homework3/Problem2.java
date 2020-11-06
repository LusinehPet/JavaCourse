package com.company.homework3;

public class Problem2 {

    public static void main(String[] args) {

        int i = 0;

        while (i <= 20) {
            i++;
            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i);

        }
    }
}