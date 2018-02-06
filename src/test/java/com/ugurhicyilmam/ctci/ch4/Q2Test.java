package com.ugurhicyilmam.ctci.ch4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q2Test {
    @Test
    public void arrayToTree_shouldBeCompleteTree() throws Exception {
        int size = 152121;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        BinarySearchTree tree = Q2.arrayToTree(array);
        int bestPossibleDepth = (int) Math.ceil(Math.log(size) / Math.log(2));
        assertEquals(bestPossibleDepth, tree.getDepth());
    }
}