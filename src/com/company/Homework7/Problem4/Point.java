package com.company.Homework7.Problem4;

public class Point {

    private int coordinateX;
    private int coordinateY;

    public Point() {
    }

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double distance() {
        return (Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2)));

    }
    public double distance(Point other){
        int newX = other.coordinateX - coordinateX;
        int newY = other.coordinateY - coordinateY;
        return (Math.sqrt(Math.pow(newX, 2) + Math.pow(newY, 2)));

    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
}
