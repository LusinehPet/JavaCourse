package com.company.homework5;

import java.util.Random;

public class Problem4 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] matrix = new int[10][15];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(90) + 10;
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[matrix.length - 1 - i][matrix[i].length - 1 - j] + " ");
            }
            System.out.println();
        }
    }
}

