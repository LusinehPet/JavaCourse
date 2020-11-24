package com.company.Homework8.Problem23;

public class DynamicIntArray {

    private int[] array = new int[]{};

    public void add(int element) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = element;
        array = newArray;
    }

    public void addAll(int[] elements) {
        int[] newArray = new int[array.length + elements.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        for (int i = 0; i < elements.length; i++) {
            newArray[array.length + i] = elements[i];
        }
        array = newArray;
    }

    public boolean contains(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        int[] newArray = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (index != i) {
                newArray[j] = array[i];
                j++;
            }
        }
        array = newArray;
    }

    public void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int size() {
        return array.length;
    }

    public void sort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}





