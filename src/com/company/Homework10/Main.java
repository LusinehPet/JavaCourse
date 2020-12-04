package com.company.Homework10;

public class Main {

    public static void main(String[] args) {
        BackwardsString backwardsString = new BackwardsString("abcdefg");
        System.out.println("length: " + backwardsString.length());
        System.out.println("isEmpty: " + backwardsString.isEmpty());
        System.out.println("from 0 to 2 subSequence: " + backwardsString.subSequence(0, 2));
        System.out.println("asString: " + backwardsString);
    }
}
