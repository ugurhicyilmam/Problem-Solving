package com.ugurhicyilmam.ctci.ch2;

import org.junit.Test;

import static com.ugurhicyilmam.ctci.ch2.TestUtil.getList;
import static org.junit.Assert.assertTrue;

public class Q1Test {
    @Test
    public void test_removeDuplicatesWithoutBuffer() throws Exception {
        LinkedListNode head = getList(10);

        Q1.removeDuplicatesWithoutBuffer(head);

        assertTrue(checkDuplicates(head));
    }

    @Test
    public void test_removeDuplicatesWithBuffer() throws Exception {
        LinkedListNode head = getList(10);

        Q1.removeDuplicatesWithBuffer(head);

        assertTrue(checkDuplicates(head));
    }
    


    private boolean checkDuplicates(LinkedListNode head) {
        if (head == null)
            return false;

        LinkedListNode current = head;
        LinkedListNode runner = null;

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