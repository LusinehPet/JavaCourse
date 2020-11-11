package com.company.homework5;

import java.util.Random;

public class Problem5 {

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

        for (int j = matrix[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
