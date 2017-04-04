package com.ugurhicyilmam.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationCheckerTest {

    @Test
    public void test_isPermutation() throws Exception {
        assertTrue(PermutationChecker.isPermutation("stack", "satck"));
        assertFalse(PermutationChecker.isPermutation("stack", "atck"));
        assertFalse(PermutationChecker.isPermutation("stack", null));
        assertFalse(PermutationChecker.isPermutation(null, "stack"));
        assertFalse(PermutationChecker.isPermutation(null, null));
        assertTrue(PermutationChecker.isPermutation("a", "a"));
        assertFalse(PermutationChecker.isPermutation("a", "b"));
    }

}