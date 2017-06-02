package com.ugurhicyilmam.ctci.ch1;

import org.junit.Test;

import static com.ugurhicyilmam.ctci.ch1.Q1.isAllUnique;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q1Test {
    @Test
    public void test_isAllUnique() throws Exception {
        assertTrue(isAllUnique("should"));
        assertFalse(isAllUnique("implement"));
        assertFalse(isAllUnique(""));
        assertFalse(isAllUnique(null));
    }
}