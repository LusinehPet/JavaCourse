package com.company.Homework14.Problem1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Set<Character> map = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (!map.add(symbol)) {
                System.out.println("First repeated character is " + symbol);
                return;
            }
        }
        System.out.println("No character is repeated");
    }
}
