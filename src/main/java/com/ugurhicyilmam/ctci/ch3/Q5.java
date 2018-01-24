package com.ugurhicyilmam.ctci.ch3;

import java.util.EmptyStackException;

public class Q5 {
    private int elements[];
    private int top;
    private int size;

    Q5(int size) {
        this.size = size;
        this.elements = new int[size];
    }

    public void push(int value) {
        if (top < size) {
            elements[top] = value;
            top++;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        top--;
        return elements[top];
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void sort() {
        Q5 tempStack = new Q5(size);
        for (int i = 0; i < size; i++) {
            boolean skipped = false;
            int max = Integer.MIN_VALUE;
            int n = size - i;
            int c = 0;
            while (c < n) {
                int value = this.pop();
                if (value > max) {
                    max = value;
                }
                tempStack.push(value);
                c++;
            }
            this.push(max);
            while (!tempStack.isEmpty()) {
                int value = tempStack.pop();
                if (value != max || skipped) {
                    this.push(value);
                } else {
                    skipped = true;
                }
            }

        }
    }
}