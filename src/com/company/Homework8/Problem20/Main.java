package com.company.Homework8.Problem20;

public class Main {

    public static void main(String[] args) {

        Author[] authors = {
                new Author("Jake", "London", Gender.MALE),
                new Author("Silva", "Kaputikyan", Gender.FEMALE)
        };
        Book book = new Book("Qaos", authors, 100);
    }

}
