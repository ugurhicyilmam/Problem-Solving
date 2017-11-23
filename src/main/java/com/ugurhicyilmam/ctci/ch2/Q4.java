package com.ugurhicyilmam.ctci.ch2;

final class Q4 {

    private Q4() {

    }

    static LinkedListNode createPartitions(LinkedListNode listNode, long k) {
        LinkedListNode leftCurrent = null;
        LinkedListNode leftHead = null;
        LinkedListNode rightCurrent = null;
        LinkedListNode rightHead = null;
        LinkedListNode current = listNode;
        while (current != null) {
            if (current.getValue() < k) {
                if (leftCurrent == null) {
                    leftCurrent = current;
                    leftHead = leftCurrent;
                } else {
                    leftCurrent.setNext(current);
                    leftCurrent = current;
                }
            } else {
                if (rightCurrent == null) {
                    rightCurrent = current;
                    rightHead = rightCurrent;
                } else {
                    rightCurrent.setNext(current);
                    rightCurrent = current;
                }
            }
            current = current.getNext();
        }

        if (leftCurrent != null) {
            leftCurrent.setNext(rightHead);
            return leftHead;
        }
        return null;
    }
}
