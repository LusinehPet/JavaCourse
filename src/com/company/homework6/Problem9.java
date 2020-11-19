package com.company.homework6;

import java.util.Scanner;

public class Problem9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        System.out.println(getPerimeterOfCircle(radius));
        System.out.println(getAreaOfCircle(radius));

    }

    public static double getPerimeterOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double getAreaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
