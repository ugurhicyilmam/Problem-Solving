package com.ugurhicyilmam.ctci.ch1;

final class Q3 {

    private Q3() {

    }

    static String urlify(String str) {

        if (str == null || str.length() == 0)
            return "";

        int spaces = 0;

        String trimmed = str.trim();

        for (int i = 0; i < trimmed.length(); i++) {
            if (Character.isWhitespace(trimmed.charAt(i)))
                spaces++;
        }

        char[] urlified = new char[trimmed.length() + spaces * 2];

        int insertSlot = 0;

        for (int i = 0; i < trimmed.length(); i++) {
            if (!Character.isWhitespace(trimmed.charAt(i))) {
                urlified[insertSlot++] = trimmed.charAt(i);
            } else {
                urlified[insertSlot++] = '%';
                urlified[insertSlot++] = '2';
                urlified[insertSlot++] = '0';
            }
        }

        return String.valueOf(urlified);
    }
}
