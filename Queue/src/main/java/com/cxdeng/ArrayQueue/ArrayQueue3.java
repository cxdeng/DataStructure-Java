package com.cxdeng.ArrayQueue;

import com.cxdeng.Queue;

import java.util.Iterator;

public class ArrayQueue3<E> implements Queue<E>, Iterable<E> {

    private final E[] arr;
    private int head = 0;
    private int tail = 0;


    @SuppressWarnings("all")
    public ArrayQueue3(int capacity) {
        arr = (E[]) new Object[capacity];
    }

    @Override
    public boolean offer(E value) {
        if (isFull()) {
            return false;
        }

        arr[tail % arr.length] = value;
        tail++;

        return true;
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }

        E value = arr[head % arr.length];
        head++;

        return value;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }

        return arr[head % arr.length];
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public boolean isFull() {
        return tail - head == arr.length;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private int p = head;

            @Override
            public boolean hasNext() {
                return p != tail;
            }

            @Override
            public E next() {
                E val = arr[p % arr.length];
                p++;
                return val;
            }
        };
    }
}
