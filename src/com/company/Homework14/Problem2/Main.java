package com.company.Homework14.Problem2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            map.put(symbol, map.getOrDefault(symbol, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character is " + entry.getKey());
                return;
            }
        }
        System.out.println("No character is non-repeated");
    }
}
