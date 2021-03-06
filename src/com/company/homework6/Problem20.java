package com.company.homework6;

import java.util.Random;
import java.util.Scanner;

public class Problem20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[][] matrix = getMatrix(number);
        printMatrix(matrix);

        while (true) {
            System.out.println();
            System.out.println("———————- MENU —————-");
            System.out.println("enter 1 for rotating 90*");
            System.out.println("enter 2 for rotating 180*");
            System.out.println("enter 3 for rotating 270*");
            System.out.println("enter 4 for Exit");

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    printMatrix(rotate90Degrees(matrix));
                    return;
                case 2:
                    printMatrix(rotate180Degrees(matrix));
                    return;
                case 3:
                    printMatrix(rotate270Degrees(matrix));
                    return;
                case 4:
                    return;
            }
        }
    }

    public static int[][] getMatrix(int number) {

        int[][] matrix = new int[number][number];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(52) + 27;
            }
        }
        return matrix;
    }

    public static int[][] rotate90Degrees(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix[0].length][matrix.length];

        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                rotatedMatrix[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    public static int[][] rotate180Degrees(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rotatedMatrix[i][j] = matrix[matrix.length - 1 - i][matrix[i].length - 1 - j];
            }
        }
        return rotatedMatrix;
    }

    public static int[][] rotate270Degrees(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix[0].length][matrix.length];

        for (int j = matrix[0].length - 1; j >= 0; j--) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                rotatedMatrix[matrix[0].length - 1 - j][i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}