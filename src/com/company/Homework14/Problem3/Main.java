package com.company.Homework14.Problem3;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int number = new Random().nextInt(100) + 1;
        System.out.println("Generated value by computer: " + number);
        guess(1, 100, number, 0);
    }

    private static void guess(int from, int to, int number, int steps) {
        int nextGuess = to + (from - to) / 2;
        steps++;
        if (number > nextGuess) {
            guess(nextGuess, to, number, steps);
        } else if (number < nextGuess) {
            guess(from, nextGuess, number, steps);
        } else {
            System.out.println("Guessed! Your number is " + number + ", guessed in " + steps + " steps");
        }
    }
}
