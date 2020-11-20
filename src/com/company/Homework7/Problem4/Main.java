package com.company.Homework7.Problem4;

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(3,5);
        Point point2 = new Point();

        System.out.println(point1.distance());
        System.out.println(point1.distance(point2));

    }
}
