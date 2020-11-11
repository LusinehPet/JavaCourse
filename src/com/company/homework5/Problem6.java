package com.company.homework5;

import java.util.Random;
import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(90) + 10;
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        while (true) {
            System.out.println();
            System.out.println("———————- MENU —————-");
            System.out.println("enter 1 for rotating 90*");
            System.out.println("enter 2 for rotating 180*");
            System.out.println("enter 3 for rotating 270*");
            System.out.println("enter 4 for Exit");

            Scanner scanner = new Scanner(System.in);
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    for (int j = 0; j < matrix[0].length; j++) {
                        for (int i = matrix.length - 1; i >= 0; i--) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    return;
                case 2:
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[matrix.length - 1 - i][matrix[i].length - 1 - j] + " ");
                        }
                        System.out.println();
                    }
                    return;
                case 3:
                    for (int j = matrix[0].length - 1; j >= 0; j--) {
                        for (int i = 0; i < matrix.length; i++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    return;
                case 4:
                    return;
            }
        }
    }
}
