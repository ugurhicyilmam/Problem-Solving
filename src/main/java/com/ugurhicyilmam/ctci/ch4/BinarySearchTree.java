package com.ugurhicyilmam.ctci.ch4;

class BinarySearchTree {
    private TreeNode root;
    private int depth;

    void insert(int value) {

        if (root == null) {
            root = new TreeNode(value);
            return;
        }

        TreeNode current = root;

        while (current != null) {
            if (current.getValue() <= value) {
                if (current.getLeft() == null) {
                    current.setLeft(new TreeNode(value));
                    return;
                } else {
                    current = current.getLeft();
                }
            } else {
                if (current.getRight() == null) {
                    current.setRight(new TreeNode(value));
                    return;
                } else {
                    current = current.getRight();
                }
            }
        }
    }

    void print() {
        printTree(this.root, 0);
    }

    private void printTree(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        printTree(node.getLeft(), level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                System.out.print("|\t");
            System.out.println("|-------" + node.getValue());
        } else {
            System.out.println(node.getValue());
        }

        printTree(node.getRight(), level + 1);
    }

    private void levels(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (level > depth) {
            depth = level;
        }

        levels(node.getLeft(), level + 1);
        levels(node.getRight(), level + 1);
    }

    public int getDepth() {
        if (this.root == null) {
            return 0;
        }
        levels(this.root, 1);
        return depth;
    }
}