package com.ugurhicyilmam.ctci.ch2;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Q1Test {
    @Test
    public void test_removeDuplicatesWithoutBuffer() throws Exception {
        Q1.LinkedListNode head = getList();

        Q1.removeDuplicatesWithoutBuffer(head);

        assertTrue(checkDuplicates(head));
    }

    @Test
    public void test_removeDuplicatesWithBuffer() throws Exception {
        Q1.LinkedListNode head = getList();

        Q1.removeDuplicatesWithBuffer(head);

        assertTrue(checkDuplicates(head));
    }
    

    private Q1.LinkedListNode getList() {
        Q1.LinkedListNode head = new Q1.LinkedListNode(1);
        Q1.LinkedListNode node1 = new Q1.LinkedListNode(2);
        Q1.LinkedListNode node2 = new Q1.LinkedListNode(2);
        Q1.LinkedListNode node3 = new Q1.LinkedListNode(3);
        Q1.LinkedListNode node4 = new Q1.LinkedListNode(3);
        Q1.LinkedListNode node5 = new Q1.LinkedListNode(4);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(null);

        return head;
    }

    private boolean checkDuplicates(Q1.LinkedListNode head) {
        if (head == null)
            return false;

        Q1.LinkedListNode current = head;
        Q1.LinkedListNode runner = null;

        while(current != null) {
            runner = current.getNext();

            while(runner != null) {
                if(current.getValue() == runner.getValue()) {
                    return false;
                }
                runner = runner.getNext();
            }

            current = current.getNext();
        }
        return true;
    }
}