package com.company.homework6;

public class Problem14 {

    public static void main(String[] args) {
        printPrimeNumbers();
    }

    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers() {
        for (int i = 2; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }
}