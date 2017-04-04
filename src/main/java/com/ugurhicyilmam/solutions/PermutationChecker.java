package com.ugurhicyilmam.solutions;

/**
 * Question: Write a method to decide if one string is permutation of the other.
 * Solution: Count number of characters in each string, then compare this character counts to check if they are permutations.
 */
final class PermutationChecker {

    private PermutationChecker() {

    }

    static boolean isPermutation(String first, String second) {
        if (first == null || second == null || first.length() != second.length())
            return false;

        if (first.length() == 1)
            return first.equals(second);


        int stringLength = first.length();
        int arrayLength = 255;
        int[] firstCharCounter = new int[arrayLength];
        int[] secondCharCounter = new int[arrayLength];

        for (int i = 0; i < stringLength ; i++) {
            firstCharCounter[first.charAt(i)]++;
            secondCharCounter[second.charAt(i)]++;
        }

        for (int i = 0; i < arrayLength; i++) {
            if(firstCharCounter[i] != secondCharCounter[i])
                return false;
        }

        return true;
    }
}
