package com.ugurhicyilmam.ctci.ch4;

class Q2 {

    static BinarySearchTree arrayToTree(int[] array) {
        BinarySearchTree tree = new BinarySearchTree();
        addMedianToTree(tree, array, 0, array.length - 1);
        return tree;
    }

    private static void addMedianToTree(BinarySearchTree tree, int[] array, int from, int to) {
        if(from > to) {
            return;
        }

        int median = (int) Math.floor((from + to) / 2);
        tree.insert(array[median]);
        addMedianToTree(tree, array, from, median - 1);
        addMedianToTree(tree, array, median + 1, to);
    }
}
