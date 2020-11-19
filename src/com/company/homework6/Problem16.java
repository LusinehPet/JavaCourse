package com.company.homework6;

import java.util.Scanner;

public class Problem16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        System.out.println(isWordPalindrome(word));

    }

    public static boolean isWordPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;

            }
        }
        return true;
    }

}
