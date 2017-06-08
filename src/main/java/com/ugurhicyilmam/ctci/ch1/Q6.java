package com.ugurhicyilmam.ctci.ch1;

final class Q6 {

    private Q6() {

    }

    private static boolean isCompressionPerformant(String str) {
        if (str == null || str.length() == 0)
            return false;

        char lastChar = str.charAt(0);
        int charChangeCount = 1;

        for (char c : str.toCharArray()) {
            if (c != lastChar) {
                charChangeCount++;
            }
            lastChar = c;
        }

        return ((double) str.length() / charChangeCount) > 2;
    }

    static String compress(String str) {

        if (!isCompressionPerformant(str))
            return str;

        StringBuilder sb = new StringBuilder();

        char lastChar = str.charAt(0);
        int charCounter = 0;

        for (char c : str.toCharArray()) {
            if (lastChar == c) {
                charCounter++;
            } else {
                sb.append(lastChar);
                sb.append(charCounter);
                lastChar = c;
                charCounter = 1;
            }
        }

        //append remaining char
        sb.append(lastChar);
        sb.append(charCounter);

        return sb.toString();
    }

}
