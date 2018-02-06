package com.ugurhicyilmam.ctci.ch4;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

class Q1 {

    static boolean pathExists(Node node1, Node node2) {
        Set<Node> visitedByNode1 = new HashSet<>();
        Set<Node> visitedByNode2 = new HashSet<>();
        Queue<Node> node1Queue = new ArrayDeque<>();
        Queue<Node> node2Queue = new ArrayDeque<>();
        node1Queue.offer(node1);
        node2Queue.offer(node2);
        while (!node1Queue.isEmpty() || !node2Queue.isEmpty()) {

            // visit node1
            Node node1Current = node1Queue.poll();
            if (visitedByNode2.contains(node1Current)) {
                return true;
            }
            visitedByNode1.add(node1Current);

            if (node1Current != null) {
                for (Node neighbor : node1Current.getNodes()) {
                    if (!visitedByNode1.contains(neighbor)) {
                        node1Queue.offer(neighbor);
                    }
                }
            }

            // visit node2
            Node node2Current = node2Queue.poll();
            if (visitedByNode1.contains(node2Current)) {
                return true;
            }
            visitedByNode2.add(node2Current);

            if (node2Current != null) {
                for (Node neighbor : node2Current.getNodes()) {
                    if (!visitedByNode2.contains(neighbor)) {
                        node2Queue.offer(neighbor);
                    }
                }
            }
        }
        return false;
    }
}
