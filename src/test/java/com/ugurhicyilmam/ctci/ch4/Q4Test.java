package com.ugurhicyilmam.ctci.ch4;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q4Test {
    @Test
    public void isBalanced_WhenBalanced() throws Exception {
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

        assertTrue(Q4.isBalanced(root));
    }

    @Test
    public void isBalanced_WhenNotBalanced() throws Exception {
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
        node2.setRight(node3);
        node2.setLeft(node4);
        node3.setRight(node5);
        node3.setLeft(node6);
        node4.setLeft(node7);
        node4.setRight(node8);

        assertFalse(Q4.isBalanced(root));
    }
}