package com.ugurhicyilmam.ctci.ch2;

class TestUtil {
    static LinkedListNode getList(int numberOfElements) {
        assert numberOfElements > 0;

        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode parentElement = head;
        LinkedListNode element = null;

        for (int i = 1; i < numberOfElements; i++) {
            element = new LinkedListNode(i);
            parentElement.setNext(element);
            parentElement = element;
        }
        return head;
    }
}
