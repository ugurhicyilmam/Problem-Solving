package com.ugurhicyilmam.ctci.ch1;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class Q7Test {

    @Test
    public void test_rotateMatrixInPlaceWhen3x3() throws Exception {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] rotatedMatrix = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        assertFalse(Arrays.deepEquals(matrix, rotatedMatrix));

        Q7.rotateMatrixInPlace(matrix);

        assertTrue(Arrays.deepEquals(matrix, rotatedMatrix));
    }

    @Test
    public void test_rotateMatrixInPlaceWhen2x2() throws Exception {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        int[][] rotatedMatrix = {
                {3, 1},
                {4, 2}
        };
        assertFalse(Arrays.deepEquals(matrix, rotatedMatrix));

        Q7.rotateMatrixInPlace(matrix);

        assertTrue(Arrays.deepEquals(matrix, rotatedMatrix));
    }

}