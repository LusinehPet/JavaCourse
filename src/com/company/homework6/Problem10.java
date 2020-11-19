package com.company.homework6;

import java.util.Scanner;

public class Problem10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (isValidTriangle(a, b, c)) {
            System.out.println(getPerimeterOfTriangle(a, b, c));
            System.out.println(getAreaOfTriangle(a, b, c));
        }
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        return a < b + c && b < a + c && c < a + b;
    }

    public static int getPerimeterOfTriangle(int a, int b, int c) {
        return a + b + c;
    }

    public static double getAreaOfTriangle(int a, int b, int c) {
        int semiPerimeter = getPerimeterOfTriangle(a, b, c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }
}
