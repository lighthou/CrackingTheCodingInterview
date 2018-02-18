package com.company;

import java.util.HashMap;

public class Chapter_1 {

    // My Solution
    public boolean isUnique(String string) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (hashMap.containsKey(string.charAt(i))) {
                return false;
            } else {
                hashMap.put(string.charAt(i), i);
            }
        }
        return true;
    }

    //Optimal Solution
    //Is it ascii or unicode? Ascii is only up to 128.
    public boolean isUniqueOptimal(String string) {
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < string.length(); i++) {
            int value = string.charAt(i);
            if (char_set[value]) {
                return false;
            }
            char_set[value] = true;
        }
        return true;
    }
}
