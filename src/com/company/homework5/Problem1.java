package com.company.homework5;

import java.util.Random;

public class Problem1 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] matrix = new int[10][15];
        int min = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(90) + 10;
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println(min);
        }

        System.out.println();
        System.out.println(min);

    }
}


