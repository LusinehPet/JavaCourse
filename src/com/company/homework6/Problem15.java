package com.company.homework6;

import java.util.Random;

public class Problem15 {


    public static void main(String[] args) {
      int [] array = new int[10];

        fillArray(array);
        printArray(array);
        printArray(reversedArray(array));

    }

    public static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[] reversedArray(int[] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
          newArray[array.length - 1 - i] = array[i];

        }
        return newArray;
    }
}
