package com.company.homework4;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        int[] array = {4, 7, 9, 3, 2, 7};

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                index = i;
                break;

            }
        }
        if (index == -1) {
            System.out.println("wrong number, please try again");
            return;
        }
        int[] newArray = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
           if (i == index) {
               continue;
           }
           newArray[j] = array[i];
            j++;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}

