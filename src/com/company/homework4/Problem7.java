package com.company.homework4;

public class Problem7 {

    public static void main(String[] args) {

        int[] array = {1, 3, 5, 6, 3, 7, 9, 7};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j]);
                }
            }
        }
    }
}
