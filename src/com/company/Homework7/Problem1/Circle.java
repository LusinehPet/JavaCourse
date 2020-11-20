package com.company.Homework7.Problem1;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle() {
    }

    public double calculateTheArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double calculateThePerimeter(){
        return Math.PI * 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

