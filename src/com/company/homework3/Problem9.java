package com.company.homework3;

public class Problem9 {

    public static void main(String[] args) {

        int i = 0;

        while (i < 5) {
            i++;
            int cube = (int) Math.pow(i, 3);

            System.out.println("Number is : " + i + " and cube of the " + i + " is :" + cube);
        }

    }
}
