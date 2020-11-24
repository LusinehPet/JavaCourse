package com.company.Homework8.Problem23;

public class Main {

    public static void main(String[] args) {

        DynamicIntArray dynamicIntArray = new DynamicIntArray();

        dynamicIntArray.add(8);
        dynamicIntArray.addAll(new int[]{1, 6, 2, 7});
        dynamicIntArray.remove(1);
        dynamicIntArray.swap(0, 2);
        dynamicIntArray.sort();

        dynamicIntArray.print();
        System.out.println("Contains 6: " + dynamicIntArray.contains(6));
        System.out.println("Int array size: " + dynamicIntArray.size());
    }
}