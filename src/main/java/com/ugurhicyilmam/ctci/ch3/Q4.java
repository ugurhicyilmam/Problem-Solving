package com.ugurhicyilmam.ctci.ch3;

import java.util.EmptyStackException;

public class Q4 {

    private Stack pushStack = new Stack();
    private Stack popStack = new Stack();


    void enqueue(int value) {
        pushStack.push(value);
    }

    int dequeue() {
        if (popStack.isEmpty()) {
            if (pushStack.isEmpty()) {
                throw new EmptyQueueException();
            }
            this.pushToPop();
        }
        return popStack.pop();
    }

    private void pushToPop() {
        while(!pushStack.isEmpty()) {
            popStack.push(pushStack.pop());
        }
    }

    private class Stack {

        private Node head;

        void push(int value) {
            head = new Node(value, head);
        }

        int pop() {
            if (this.isEmpty()) {
                throw new EmptyStackException();
            }
            int value = head.value;
            head = head.next;
            return value;
        }

        boolean isEmpty() {
            return head == null;
        }

        private class Node {
            int value;
            Node next;

            Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }
        }
    }

    class EmptyQueueException extends RuntimeException {
    }
}
