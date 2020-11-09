package com.company.homework4;

public class Problem10 {

    public static void main(String[] args) {

        int[] array = {3, 7, 5, 10, 9, 8, 32};
        int max;
        int secondMax;

        if (array[0] > array[1]){
            max = array[0];
            secondMax = array[1];
        } else {
            max = array[1];
            secondMax = array[0];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i]>secondMax && array[i]<max) {
                secondMax = array[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}

