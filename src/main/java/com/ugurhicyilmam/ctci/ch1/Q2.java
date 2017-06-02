package com.ugurhicyilmam.ctci.ch1;

final class Q2 {

    private Q2() {

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
