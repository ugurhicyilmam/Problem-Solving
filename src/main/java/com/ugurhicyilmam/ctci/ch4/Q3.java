package com.ugurhicyilmam.ctci.ch4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Q3 {
    static Map<Integer, LinkedList<TreeNode>> linkedListOfDepths(TreeNode root) {
        Map<Integer, LinkedList<TreeNode>> linkedListDepts = new HashMap<>();
        putNodeIntoLinkedList(linkedListDepts, root, 0);
        return linkedListDepts;
    }

    private static void putNodeIntoLinkedList(Map<Integer, LinkedList<TreeNode>> linkedListMap, TreeNode node, int level) {
        if (node != null) {
            linkedListMap.putIfAbsent(level, new LinkedList<>());
            LinkedList<TreeNode> linkedList = linkedListMap.get(level);
            linkedList.add(node);
            putNodeIntoLinkedList(linkedListMap, node.getRight(), level + 1);
            putNodeIntoLinkedList(linkedListMap, node.getLeft(), level + 1);
        }
    }
}
