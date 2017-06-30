package com.ugurhicyilmam.ctci.ch2;


import java.util.HashSet;
import java.util.Set;

class Q1 {
    private Q1() {
    }

    static void removeDuplicatesWithoutBuffer(LinkedListNode head) {
        if (head == null || head.getNext() == null)
            return;

        LinkedListNode currentNode = head;
        LinkedListNode runner = null;
        LinkedListNode runnerParent = null;

        while (currentNode != null) {
            runner = currentNode.getNext();
            runnerParent = currentNode;
            while (runner != null) {
                if (currentNode.getValue() == runner.getValue()) {
                    runnerParent.setNext(runner.getNext()); // remove runner
                } else {
                    runnerParent = runner;
                }
                runner = runner.getNext();
            }
            currentNode = currentNode.getNext();
        }

    }

    static void removeDuplicatesWithBuffer(LinkedListNode head) {
        if (head == null || head.getNext() == null)
            return;

        Set<Long> values = new HashSet<>();

        LinkedListNode currentNode = head;
        LinkedListNode parentNode = head;
        while (currentNode != null) {
            if (values.contains(currentNode.getValue()))
                parentNode.setNext(currentNode.getNext()); // remove current node
            else {
                values.add(currentNode.getValue());
                parentNode = currentNode;
            }
            currentNode = currentNode.getNext();
        }
    }

    static class LinkedListNode {
        private LinkedListNode next;
        private long value;

        LinkedListNode(long value) {
            this.value = value;
        }

        LinkedListNode getNext() {
            return next;
        }

        void setNext(LinkedListNode next) {
            this.next = next;
        }

        long getValue() {
            return value;
        }

        public void setValue(long value) {
            this.value = value;
        }
    }
}
