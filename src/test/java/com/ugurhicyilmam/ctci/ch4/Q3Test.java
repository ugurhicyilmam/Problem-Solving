package com.ugurhicyilmam.ctci.ch4;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Q3Test {
    @Test
    public void linkedListOfDepths() throws Exception {
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(2);
        TreeNode node7 = new TreeNode(3);
        TreeNode node8 = new TreeNode(3);
        root.setRight(node1);
        root.setLeft(node2);
        node1.setRight(node3);
        node1.setLeft(node4);
        node2.setRight(node5);
        node2.setLeft(node6);
        node3.setLeft(node7);
        node3.setRight(node8);

        Map<Integer, LinkedList<TreeNode>> linkedListMap = Q3.linkedListOfDepths(root);
        assertEquals(0, linkedListMap.get(0).get(0).getValue());

        assertEquals(1, linkedListMap.get(1).get(0).getValue());
        assertEquals(1, linkedListMap.get(1).get(1).getValue());

        assertEquals(2, linkedListMap.get(2).get(0).getValue());
        assertEquals(2, linkedListMap.get(2).get(1).getValue());
        assertEquals(2, linkedListMap.get(2).get(2).getValue());
        assertEquals(2, linkedListMap.get(2).get(3).getValue());

        assertEquals(3, linkedListMap.get(3).get(0).getValue());
        assertEquals(3, linkedListMap.get(3).get(1).getValue());
    }
}