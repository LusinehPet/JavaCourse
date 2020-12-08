package com.company.Homework10;

public class BackwardsString implements CharSequence {

    private String source;

    public BackwardsString(String source) {
        this.source = source;
    }

    public boolean isEmpty() {
        return source.isEmpty();
    }

    @Override
    public int length() {
        return source.length();
    }

    @Override
    public char charAt(int index) {
        return source.charAt(length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String result = "";
        for (int i = length() - 2 - start; i >= length() - 1 - end; i--) {
            result += source.charAt(i);
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = length() - 1; i >= 0; i--) {
            result += source.charAt(i);
        }
        return result;
    }
}

