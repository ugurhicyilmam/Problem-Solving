package com.ugurhicyilmam.ctci.ch1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q5Test {
    @Test
    public void test_areStringsOneChangeAway() throws Exception {
        assertTrue(Q5.areStringsOneChangeAway("pale", "ple"));
        assertTrue(Q5.areStringsOneChangeAway("pale", "pales"));
        assertTrue(Q5.areStringsOneChangeAway("bale", "pale"));
        assertFalse(Q5.areStringsOneChangeAway("pale", "bake"));
    }

}