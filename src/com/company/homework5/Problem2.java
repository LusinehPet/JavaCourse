package com.company.homework5;

import java.util.Random;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] matrix = new int[10][15];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(90) + 10;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int rowNumber = scanner.nextInt();

        int sum = 0;
        for (int j = 0; j < matrix[rowNumber].length; j++) {
            sum += matrix[rowNumber][j];
        }

        System.out.println(sum);
    }
}
