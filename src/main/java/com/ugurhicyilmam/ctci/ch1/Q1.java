package com.ugurhicyilmam.ctci.ch1;

/**
 * Question: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 * Solution: Use an array to keep boolean flags for each character.
 */
public final class Q1 {

    private Q1() {

    }

    public static boolean isAllUnique(String str) {
        if (str == null || str.length() < 1 || str.length() > 256)
            return false;

        boolean[] charFlags = new boolean[256];

        char[] characters = str.toCharArray();

        for (char c : characters) {
            if (charFlags[c])
                return false;
            charFlags[c] = true;
        }
        return true;
    }
}
