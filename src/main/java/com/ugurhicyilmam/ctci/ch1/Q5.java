package com.ugurhicyilmam.ctci.ch1;

final class Q5 {

    private Q5() {

    }

    static boolean areStringsOneChangeAway(String str1, String str2) {

        if (str1 == null || str2 == null) {
            return false;
        }

        String shorterString = null;
        String longerString = null;
        if (str1.length() < str2.length()) {
            shorterString = str1;
            longerString = str2;
        } else {
            shorterString = str2;
            longerString = str1;
        }

        boolean lengthsDifferent = shorterString.length() != longerString.length();

        int shorterStringCounter = 0;
        int longerStringCounter = 0;
        int changeCounter = 0;

        for (int i = 0; i < shorterString.length(); i++) {
            if (shorterString.charAt(shorterStringCounter) != longerString.charAt(longerStringCounter)) {
                if (lengthsDifferent) {
                    longerStringCounter++;
                }
                changeCounter++;
                if (changeCounter > 1) {
                    return false;
                }
            }
            shorterStringCounter++;
            longerStringCounter++;
        }

        return changeCounter <= 1;
    }
}
