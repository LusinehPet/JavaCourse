package com.company.homework4;

public class Problem9 {

    public static void main(String[] args) {

        int[] array = {3, 7, 5, 10, 9, 8, 32, 7, 3};

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            int currentNumber = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (currentNumber == array[j]) {
                    count++;
                }
            }
            if (count > 0) {
                int k = 0;
                int[] newArray = new int[array.length - count - 1];
                for (int j = 0; j < array.length; j++) {
                    if (currentNumber != array[j]) {
                        newArray[k] = array[j];
                        k++;
                    }
                }
                array = newArray;
                i--;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}