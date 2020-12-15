package com.company.Homework13;

public class Command {

    private char productRow;
    private int productPlace;
    private int productCount;

    public Command(char productRow, int productPlace, int productCount) {
        this.productRow = productRow;
        this.productPlace = productPlace;
        this.productCount = productCount;
    }

    public char getProductRow() {
        return productRow;
    }

    public void setProductRow(char productRow) {
        this.productRow = productRow;
    }

    public int getProductPlace() {
        return productPlace;
    }

    public void setProductPlace(int productPlace) {
        this.productPlace = productPlace;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}