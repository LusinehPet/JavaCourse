package com.company.homework6;

import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        System.out.println(isPasswordValid(password));
    }

    public static boolean isPasswordValid(String password) {
        if (password.length() < 10) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (!isCharacterDigit(character) && !isCharacterLetter(character)) {
                return false;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (isCharacterDigit(character)) {
                count++;
            }
        }
        return count >= 2;
    }

    public static boolean isCharacterDigit(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }

    public static boolean isCharacterLetter(char symbol) {
        return symbol >= 'A' && symbol <= 'Z' || symbol >= 'a' && symbol <= 'z';
    }
}
