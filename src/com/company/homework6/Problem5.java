package com.company.homework6;

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        System.out.println(getMiddleChar(word));

    }

    public static char getMiddleChar(String word) {
        return word.charAt(word.length() / 2);
    }
}
