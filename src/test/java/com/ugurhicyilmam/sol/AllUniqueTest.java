package com.ugurhicyilmam.sol;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllUniqueTest {
    @Test
    public void test_isAllUnique() throws Exception {
        assertTrue(AllUnique.isAllUnique("should"));
        assertFalse(AllUnique.isAllUnique("implement"));
        assertFalse(AllUnique.isAllUnique(""));
        assertFalse(AllUnique.isAllUnique(null));
    }

}