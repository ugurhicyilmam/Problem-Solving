package com.ugurhicyilmam.ctci.ch1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q2Test {

    @Test
    public void test_isPermutation() throws Exception {
        assertTrue(Q2.isPermutation("stack", "satck"));
        assertFalse(Q2.isPermutation("stack", "atck"));
        assertFalse(Q2.isPermutation("stack", null));
        assertFalse(Q2.isPermutation(null, "stack"));
        assertFalse(Q2.isPermutation(null, null));
        assertTrue(Q2.isPermutation("a", "a"));
        assertFalse(Q2.isPermutation("a", "b"));
    }

}