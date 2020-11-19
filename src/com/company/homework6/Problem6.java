package com.company.homework6;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        System.out.println(numberOfWords(sentence));
    }

    public static int numberOfWords(String sentence) {
        int count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
