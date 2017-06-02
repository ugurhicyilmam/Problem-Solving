package com.ugurhicyilmam.ctci.ch1;

class Q1 {

    private Q1() {

    }

    static boolean isAllUnique(String str) {
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
