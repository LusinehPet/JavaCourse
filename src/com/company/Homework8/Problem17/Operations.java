package com.company.Homework8.Problem17;

import java.util.ArrayList;

public class Operations {

    private ArrayList<String> list = new ArrayList<>();

    //1
    public void fillList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("yellow");
        list.add("blue");
    }

    //2
    public void iterate() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //3
    public void insertFirstElement(String element) {
        list.add(0, element);
    }

    //4
    public String getElementAt(int index) {
        return list.get(index);
    }

    //5
    public void updateElement(int index, String element) {
        list.set(index, element);
    }

    //6
    public void removeThirdElement() {
        list.remove(2);
    }

    //7
    public int searchElementIndex(String element) {
        return list.indexOf(element);
    }

    //8
    public void sortArray() {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }

            }
        }
    }

    //9
    public ArrayList<String> getCopy() {
        ArrayList<String> newList = new ArrayList<>();
        newList.addAll(list);
        return newList;
    }

    //11
    public ArrayList<String> reversArray() {
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(list.size() - 1 - i));
        }
        return newList;
    }

    //12
    public boolean isSame(ArrayList<String> otherList) {
        if (list.size() != otherList.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(otherList.get(i))) {
                return false;
            }
        }
        return true;
    }

    //13
    public void swapElements(int from, int to) {
        String temp = list.get(from);
        list.set(from, list.get(to));
        list.set(to, temp);
    }

    //14
    public ArrayList<String> getJointLists(ArrayList<String> otherList) {
        ArrayList<String> jointList = new ArrayList<>();
        jointList.addAll(list);
        jointList.addAll(otherList);
        return jointList;
    }

    //15
    public void emptyArrayList() {
        list.clear();
    }

    //16
    public boolean isArrayListEmpty() {
        return list.isEmpty();
    }

    //17
    public void replaceSecondElement(String element) {
        list.set(1, element);
    }
}

