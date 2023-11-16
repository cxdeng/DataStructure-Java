package com.cxdeng;

import java.util.Iterator;

public class ArrayStack<E> implements Stack<E>, Iterable<E> {

    private E[] arr;
    private int top;    // 栈顶指针

    /*
        底          顶
    *   0   1   2   3
    *  top
    * */

    @SuppressWarnings("all")
    public ArrayStack(int capacity) {
        this.arr = (E[]) new Object[capacity];
    }

    @Override
    public boolean push(E value) {
        if (isFull()) {
            return false;
        }

        arr[top++] = value;
        return true;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }

        return arr[--top];
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }

        return arr[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public boolean isFull() {
        return top == arr.length;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int p = top;

            @Override
            public boolean hasNext() {
                return p != 0;
            }

            @Override
            public E next() {
                return arr[--p];
            }
        };
    }
}
