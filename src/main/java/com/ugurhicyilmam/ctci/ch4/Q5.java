package com.ugurhicyilmam.ctci.ch4;

public class Q5 {

    static boolean isBST(TreeNode root) {
        return checkIfBST(root);
    }

    private static boolean checkIfBST(TreeNode node) {

        if (node == null) {
            return true;
        }

        boolean balanced = true;

        if (node.getRight() != null) {
            balanced = node.getRight().getValue() > node.getValue();
        }

        if (node.getLeft() != null) {
            balanced = (node.getLeft().getValue() <= node.getValue()) && balanced;
        }

        return balanced && checkIfBST(node.getRight()) && checkIfBST(node.getLeft());
    }

}
