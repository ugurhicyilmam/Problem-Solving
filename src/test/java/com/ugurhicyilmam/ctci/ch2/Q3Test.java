package com.ugurhicyilmam.ctci.ch2;

import org.junit.Test;

import static com.ugurhicyilmam.ctci.ch2.TestUtil.getList;
import static org.junit.Assert.assertNotEquals;

public class Q3Test {
    @Test
    public void test_deleteSecondNode() throws Exception {

        LinkedListNode head = getList(10);
        LinkedListNode secondNode = head.getNext();
        long secondNodeValue = secondNode.getValue();
        Q3.deleteNode(secondNode);

        LinkedListNode currentNode = head;

        while (currentNode != null) {
            assertNotEquals(secondNodeValue, currentNode.getValue());
            currentNode = currentNode.getNext();
        }

    }

    @Test
    public void test_delete5thNode() throws Exception {

        LinkedListNode head = getList(10);
        LinkedListNode nodeToBeRemoved = head;

        for (int i = 0; i < 5; i++) {
            nodeToBeRemoved = nodeToBeRemoved.getNext();
        }

        long nodeToBeRemovedValue = nodeToBeRemoved.getValue();

        Q3.deleteNode(nodeToBeRemoved);

        LinkedListNode currentNode = head;

        while (currentNode != null) {
            assertNotEquals(nodeToBeRemovedValue, currentNode.getValue());
            currentNode = currentNode.getNext();
        }

    }

}