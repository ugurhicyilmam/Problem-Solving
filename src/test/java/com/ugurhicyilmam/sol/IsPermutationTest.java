package com.ugurhicyilmam.sol;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPermutationTest {

    @Test
    public void test_isPermutation() throws Exception {
        assertTrue(IsPermutation.isPermutation("stack", "satck"));
        assertFalse(IsPermutation.isPermutation("stack", "atck"));
        assertFalse(IsPermutation.isPermutation("stack", null));
        assertFalse(IsPermutation.isPermutation(null, "stack"));
        assertFalse(IsPermutation.isPermutation(null, null));
        assertTrue(IsPermutation.isPermutation("a", "a"));
        assertFalse(IsPermutation.isPermutation("a", "b"));
    }

}