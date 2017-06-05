package com.ugurhicyilmam.ctci.ch1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q4Test {

    @Test
    public void test_isPermutationOfPalindrome() throws Exception {
        assertTrue(Q4.isPermutationOfPalindrome("nazan"));
        assertFalse(Q4.isPermutationOfPalindrome("hasan"));
    }

}