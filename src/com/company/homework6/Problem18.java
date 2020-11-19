package com.company.homework6;

import java.util.Random;
import java.util.Scanner;

public class Problem18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        printMatrix(getMatrix(number));
    }

    public static char[][] getMatrix(int number) {
        Random random = new Random();
        char[][] matrix = new char[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                int symbolAsInt = random.nextInt(2);
                if (symbolAsInt == 0) {
                    matrix[i][j] = '+';
                } else {
                    matrix[i][j] = '-';
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}