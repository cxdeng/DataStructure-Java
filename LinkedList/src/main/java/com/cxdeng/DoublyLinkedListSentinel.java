package com.cxdeng;


import java.util.Iterator;

/*
 * 双向链表 (哨兵)
 * */
public class DoublyLinkedListSentinel implements Iterable<Integer> {

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


    // 头部哨兵
    private final Node head;

    // 尾部哨兵
    private final Node tail;

    public DoublyLinkedListSentinel() {
        head = new Node(null, -1, null);
        tail = new Node(null, -1, null);
        head.next = tail;
        tail.prev = head;
    }

    private Node findNode(int index) {
        int i = -1;
        for (Node p = head; p != tail; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }

        return null;
    }

    public void addLast(int value) {
        Node lastNode = tail.prev;
        Node newNode = new Node(lastNode, value, tail);

        lastNode.next = newNode;
        tail.prev = newNode;
    }


    public void removeLast() {
        Node delNode = tail.prev;
        if (delNode == head){
            throw new IllegalArgumentException("The list is Empty");
        }
        Node prevNode = delNode.prev;

        prevNode.next = tail;
        tail.prev = prevNode;
    }


    public void insert(int index, int value) {
        Node prevNode = findNode(index - 1);
        if (prevNode == null) {
            throw new IllegalArgumentException(String.format("Illegal Argument: [%d]", index));
        }

        Node nextNode = prevNode.next;

        Node newNode = new Node(prevNode, value, nextNode);

        prevNode.next = newNode;
        nextNode.prev = newNode;
    }


    public void removeFirst() {
        Node delNode = head.next;
        if (delNode == tail) {
            throw new IllegalArgumentException("The list is Empty");
        }

        Node nextNode = delNode.next;

        head.next = nextNode;
        nextNode.prev = head;
    }


    public void remove(int index) {
        Node prevNode = findNode(index - 1);
        if (prevNode == null) {
            throw new IllegalArgumentException(String.format("Illegal Argument: [%d]", index));
        }

        Node delNode = prevNode.next;
        if (delNode == tail) {
            throw new IllegalArgumentException(String.format("Illegal Argument: [%d]", index));
        }
        Node nextNode = delNode.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            Node p = head.next;

            @Override
            public boolean hasNext() {
                return p != tail;
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
