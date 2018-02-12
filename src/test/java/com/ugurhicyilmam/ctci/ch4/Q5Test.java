package com.ugurhicyilmam.ctci.ch4;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q5Test {
    @Test
    public void isBST_whenBST() throws Exception {
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(5);

        root.setLeft(node1);
        node1.setLeft(node2);
        node1.setRight(node3);
        node3.setLeft(node4);
        root.setRight(node5);

        assertTrue(Q5.isBST(root));
    }

    @Test
    public void isBST_whenNotBST() throws Exception {
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(5);

        root.setLeft(node1);
        node1.setLeft(node2);
        node1.setRight(node5);
        node5.setLeft(node4);
        root.setRight(node3);

        assertFalse(Q5.isBST(root));
    }

    @Test
    public void validateBinarySearchTree() throws Exception {
        BinarySearchTree bst = new BinarySearchTree();
        for (int i = 0; i < 100; i++) {
            bst.insert(i);
        }

        assertTrue(Q5.isBST(bst.getRoot()));
    }
}