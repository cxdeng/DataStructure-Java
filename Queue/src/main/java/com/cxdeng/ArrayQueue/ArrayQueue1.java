package com.cxdeng.ArrayQueue;

import com.cxdeng.Queue;

import java.util.Iterator;

public class ArrayQueue1<E> implements Queue<E>, Iterable<E> {

    private E[] arr;
    private int head = 0;
    private int tail = 0;

    @SuppressWarnings("all")
    public ArrayQueue1(int capacity) {
        arr = (E[]) new Object[capacity + 1];
    }

    @Override
    public boolean offer(E value) {
        if (isFull()) {
            return false;
        }

        arr[tail] = value;
        tail = (tail + 1) % arr.length;

        return true;
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }

        E value = arr[head];
        head = (head + 1) % arr.length;
        return value;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }

        return arr[head];
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public boolean isFull() {
        return (tail + 1) % arr.length == head;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int p = head;

            @Override
            public boolean hasNext() {
                return p != tail;
            }

            @Override
            public E next() {
                E val = arr[p];
                p = (p + 1) % arr.length;
                return val;
            }
        };
    }
}
