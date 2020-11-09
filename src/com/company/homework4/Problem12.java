package com.company.homework4;

import java.util.Scanner;

public class Problem12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
