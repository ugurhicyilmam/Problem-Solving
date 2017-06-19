package com.ugurhicyilmam.ctci.ch1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q8Test {
    @Test
    public void fillWithZero() throws Exception {
        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 1, 0, 1},
                {0, 1, 1, 1}
        };

        int[][] filledWithZero = {
                {0, 1, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        assertFalse(Arrays.deepEquals(matrix, filledWithZero));

        Q8.fillWithZero(matrix);

        assertTrue(Arrays.deepEquals(matrix, filledWithZero));
    }
}