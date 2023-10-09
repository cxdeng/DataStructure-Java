package com.cxdeng;

import javax.swing.*;
import java.util.Iterator;

/*
 * 双向环形链表 (带哨兵)
 * */
public class CircularDoublyLinkedListSentinel implements Iterable<Integer> {

    private static class Node {
        Node prev;  // 上一个节点指针
        int value; // 值
        Node next;  // 下一个节点指针

        public Node(Node prev, int value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }


    private final Node sentinel = new Node(null, -1, null);

    public CircularDoublyLinkedListSentinel() {
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
    }


    public void addFirst(int value) {
        Node next = sentinel.next;
        Node newNode = new Node(sentinel, value, next);

        sentinel.next = newNode;
        next.prev = newNode;
    }


    public void addLast(int value) {
        Node prevNode = sentinel.prev;
        Node newNode = new Node(prevNode, value, sentinel);

        prevNode.next = newNode;
        sentinel.prev = newNode;
    }


    public void removeFirst() {
        Node delNode = sentinel.next;
        if (delNode == sentinel) {
            throw new IllegalArgumentException("The list is Empty");
        }

        Node nextNode = delNode.next;

        sentinel.next = nextNode;
        nextNode.prev = sentinel;
    }


    public void removeLast() {
        Node delNode = sentinel.prev;
        if (delNode == sentinel) {
            throw new IllegalArgumentException("The list is Empty");
        }

        Node prevNode = delNode.prev;

        prevNode.next = sentinel;
        sentinel.prev = prevNode;
    }


    public void removeByValue(int value) {
        Node p = sentinel.next;
        while (p != sentinel) {
            if (p.value == value) {
                Node prevNode = p.prev;
                Node nextNode = p.next;
                prevNode.next = nextNode;
                nextNode.prev = prevNode;
            }
            p = p.next;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = sentinel.next;

            @Override
            public boolean hasNext() {
                return p != sentinel;
            }

            @Override
            public Integer next() {
                int value = p.value;
                p = p.next;
                return value;
            }
        };
    }
}
