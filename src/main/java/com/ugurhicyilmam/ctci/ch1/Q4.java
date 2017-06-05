package com.ugurhicyilmam.ctci.ch1;

import java.util.HashMap;
import java.util.Map;

final class Q4 {

    private Q4() {

    }

    static boolean isPermutationOfPalindrome(String str) {

        if(str == null || str.trim().length() == 0)
            return false;

        Map<Character, Integer> characterCounts = new HashMap<>();
        for (Character c : str.toCharArray()) {
            characterCounts.put(c, characterCounts.getOrDefault(c, 0) + 1);
        }

        int numberOfOddCountedCharacters = 0;

        for (Integer count : characterCounts.values()) {
            if (count % 2 != 0) {
                numberOfOddCountedCharacters++;
            }
        }

        return numberOfOddCountedCharacters <= 1;
    }
}
