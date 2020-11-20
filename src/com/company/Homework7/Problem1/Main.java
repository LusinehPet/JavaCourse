package com.company.Homework7.Problem1;

import com.company.Homework7.Problem1.Circle;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(10);

        Circle anotherCircle = new Circle();
        anotherCircle.setRadius(24);

        System.out.println(circle.calculateTheArea());
        System.out.println(circle.calculateThePerimeter());

        System.out.println(anotherCircle.calculateThePerimeter());
        System.out.println(anotherCircle.calculateTheArea());
    }
}
