package com.company.homework4;

public class Problem6 {

    public static void main(String[] args) {

        int[] array = {4, 7, 9, 3, 8, 2};
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}

