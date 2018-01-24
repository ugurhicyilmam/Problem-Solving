package com.ugurhicyilmam.ctci.ch3;

import java.util.EmptyStackException;

class Q3 {
    private Stack head;
    private int threshold;
    private int length;

    Q3(int threshold) {
        this.threshold = threshold;
        this.head = new Stack(threshold);
    }

    private class Stack {
        private int values[];
        private int head;
        private int length;
        Stack next;

        Stack(int threshold) {
            values = new int[threshold];
            head = 0;
            length = 0;
        }

        int pop() {
            if (!this.isEmpty()) {
                head--;
                length--;
                return values[head];
            }
            throw new EmptyStackException();
        }

        void push(int value) {
            if (length < threshold) {
                values[head] = value;
                head++;
                length++;
            } else {
                throw new StackOverflowError();
            }
        }

        boolean isFull() {
            return length >= threshold;
        }

        boolean isEmpty() {
            return length == 0;
        }
    }

    int pop() {
        if (head.isEmpty()) {
            head = head.next;
        }

        if (head == null) {
            head = new Stack(threshold);
            throw new EmptyStackException();
        }
        length--;
        return head.pop();
    }

    void push(int value) {
        if (head.isFull()) {
            Stack temp = head;
            head = new Stack(threshold);
            head.next = temp;
        }
        length++;
        head.push(value);
    }

    int popAt(int i) {

        int numberOfStacks = (int) Math.ceil(length / threshold);
        int target = numberOfStacks - i;

        int current = 1;
        Stack runner = head;
        while (current < target) {
            runner = runner.next;
            if (runner == null) {
                throw new IndexOutOfBoundsException();
            }
            current++;
        }
        return runner.pop();
    }
}
