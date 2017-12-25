package com.ugurhicyilmam.ctci.ch2;

import java.util.HashSet;
import java.util.Set;

class Q8 {

    /**
     * A better solution would be implementing Floyd'S Cycle Detection algorithm but I didn't quite get how it is working.
     * Until I understand, I prefer to add a simpler solution.
     */
    static LinkedListNode beginningOfLoop(LinkedListNode head) {
        Set<LinkedListNode> visitedNodes = new HashSet<>();

        LinkedListNode currentNode = head;

        while (true) {
            if (currentNode == null) {
                return null;
            }

            if (visitedNodes.contains(currentNode)) {
                return currentNode;
            }
            visitedNodes.add(currentNode);
            currentNode = currentNode.getNext();
        }
    }
}
