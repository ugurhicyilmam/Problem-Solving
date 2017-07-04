package com.ugurhicyilmam.ctci.ch2;

class Q2 {

    private Q2() {

    }

    static LinkedListNode kthToLast(LinkedListNode head, long k) {
        if(head == null)
             return null;

        LinkedListNode current = head;
        LinkedListNode runner = head;

        for (int i = 0; i < k; i++) {
            if(runner == null)
                return null;

            runner = runner.getNext();
        }

        while(runner.getNext() != null) {
            runner = runner.getNext();
            current = current.getNext();
        }
        return current;
    }
}
