package com.company.homework4;

public class Problem2 {

    public static void main(String[] args) {

        int[] array = {3, 43, 32, 98};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = sum / array.length;
        System.out.println(average);
    }
}
