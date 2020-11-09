package com.company.homework4;

public class Problem8 {

    public static void main(String[] args) {

        String[] firstArray = {"good", "happy", "36", "slavik", "Goqor", "Sanasar"};
        String[] secondArray = {"36", "good", "sad", "Kakash", "Slo", "happy"};

        for (int i = 0; i < firstArray.length; i++) {

            for (int j = 0; j < secondArray.length; j++) {

                if (firstArray[i].equals(secondArray[j])) {

                    System.out.println(firstArray[i]);
                    break;
                }
            }
        }
    }
}

