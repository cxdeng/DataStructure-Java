package com.cxdeng.ArrayQueue;

import com.cxdeng.Queue;

import java.util.Iterator;

public class ArrayQueue2<E> implements Queue<E>, Iterable<E>  {

    private E[] arr;
    private int head = 0;
    private int tail = 0;
    int size = 0;   // 元素个数

    @SuppressWarnings("all")
    public ArrayQueue2(int capacity) {
        arr = (E[]) new Object[capacity];
    }

    @Override
    public boolean offer(E value) {
        if (isFull()) {
            return false;
        }

        arr[tail] = value;
        tail = (tail + 1) % arr.length;

        size++;
        return true;
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }

        E value = arr[head];
        head = (head + 1) % arr.length;

        size--;
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
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == arr.length;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int p = head;
            int count = 0;

            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public E next() {
                E val = arr[p];
                p = (p + 1) % arr.length;

                count++;
                return val;
            }
        };
    }
}
