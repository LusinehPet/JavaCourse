package com.company.Homework11.Problem3;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();

        String phrase = "Happy to be the member of the team";

        for (int i = 0; i < phrase.length(); i++) {

            char charAt = phrase.charAt(i);

            int count = map.getOrDefault(charAt, 0);
            count++;
            map.put(charAt, count);

        }
        System.out.println(map);
    }

}
