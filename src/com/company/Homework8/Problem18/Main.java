package com.company.Homework8.Problem18;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> products = getProducts();
        Product bestProduct = getBestProduct(products);
        System.out.println(bestProduct.getTitle() + " " + bestProduct.getRating());
    }

    public static ArrayList<Product> getProducts() {
        ArrayList<Product> newList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            String title = scanner.nextLine();
            int price = random.nextInt(51) + 50;
            int rating = random.nextInt(11);
            Product product = new Product(title, price, rating);
            newList.add(product);

        }
        return newList;
    }

    public static Product getBestProduct(ArrayList<Product> products) {
        Product bestProduct = products.get(0);
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getRating() > bestProduct.getRating()) {
                bestProduct = products.get(i);
            }
        }
        return bestProduct;
    }
}

