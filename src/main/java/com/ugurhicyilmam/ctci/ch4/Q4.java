package com.ugurhicyilmam.ctci.ch4;

public class Q4 {

    static boolean isBalanced(TreeNode root) {
        setDepths(root);
        return checkBalanced(root);
    }

    private static boolean checkBalanced(TreeNode node) {
        if (node == null) {
            return true;
        }
        int rightDepth = (node.getRight() != null) ? node.getRight().getDepth() : 0;
        int leftDepth = (node.getLeft() != null) ? node.getLeft().getDepth() : 0;
        return Math.abs(rightDepth - leftDepth) <= 1 && checkBalanced(node.getLeft()) && checkBalanced(node.getRight());
    }


    private static int setDepths(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int rightDepth = setDepths(node.getRight());
        int leftDepth = setDepths(node.getLeft());
        int depth = Math.max(rightDepth, leftDepth) + 1;
        node.setDepth(depth);
        return depth;
    }

}
