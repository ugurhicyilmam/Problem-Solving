package com.ugurhicyilmam.ctci.ch1;

final class Q9 {

    private Q9() {

    }

    static boolean isRotationDumb(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length())
            return false;

        int startsAt = -1;

        while (true) {
            startsAt = s1.indexOf(s2.charAt(0), startsAt + 1);
            if (startsAt < 0)
                break;
            boolean rotation = true;

            for (int i = 0; i < s2.length(); i++) {
                int calculatedIndex = (startsAt + i) % s1.length();
                if (s1.charAt(calculatedIndex) != s2.charAt(i))
                    rotation = false;
            }
            if (rotation)
                return true;
        }
        return false;
    }

    static boolean isRotationSmart(String s1, String s2) {
        return !(s1 == null || s2 == null || s1.length() != s2.length()) && (s1 + s1).contains(s2);
    }
}
