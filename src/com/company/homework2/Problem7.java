package com.company.homework2;

import java.util.Scanner;

public class Problem7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String monthName = scanner.nextLine();

        switch (monthName) {

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println(31);
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println(30);
                break;

            case "February":
                System.out.println(29);
                break;

            default:
                System.out.println("invalidMonth");

        }
    }
}
