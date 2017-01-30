package com.ugurhicyilmam.sol;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniquenessCheckerTest {
    @Test
    public void test_isAllUnique() throws Exception {
        assertTrue(UniquenessChecker.isAllUnique("should"));
        assertFalse(UniquenessChecker.isAllUnique("implement"));
        assertFalse(UniquenessChecker.isAllUnique(""));
        assertFalse(UniquenessChecker.isAllUnique(null));
    }

}