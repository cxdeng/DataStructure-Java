package com.cxdeng;

import java.util.Iterator;

public class SinglyLinkedListSentinel implements Iterable<Integer> {

    // 头指针指向哨兵节点
    private Node head = new Node(-1, null);


    /**
     * 节点类
     */
    private static class Node {
        int value; // 值
        Node next;  // 下一个节点指针

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    /**
     * 向链表头部添加
     *
     * @param value 待添加值
     */
    public void addFirst(int value) {
        head.next = new Node(value, head.next);
    }


    /**
     * 向链表头部添加
     *
     * @param value 待添加值
     */
    public void addLast(int value) {
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }

        p.next = new Node(value, null);
    }


    /**
     * 向索引位置插入
     *
     * @param index 索引
     * @param value 待插入值
     * @Throw: IllegalArgumentException 找不到则抛出index非法异常
     */
    public void insert(int index, int value) {

        // 找上一节点
        Node prevNode = findNode(index - 1);
        if (prevNode == null) {
            // 找不到
            throw new IllegalArgumentException(String.format("Illegal Argument: [%d]", index));
        }

        prevNode.next = new Node(value, prevNode.next);
    }


    /**
     * 删除第一个节点
     */
    public void removeFirst() {
        if (head.next == null){
            throw new IllegalArgumentException(String.format("Illegal Argument: [%d]", 0));
        }
        // 哨兵节点指向第二个节点
        head.next = head.next.next;
    }


    public void remove(int index) {
        Node prevNode = findNode(index - 1);
        if (prevNode == null) {
            throw new IllegalArgumentException(String.format("Illegal Argument: [%d]", index));
        }

        // 待删除的节点
        Node delNode = prevNode.next;
        if (delNode == null) {
            throw new IllegalArgumentException(String.format("Illegal Argument: [%d]", index));
        }
        prevNode.next = delNode.next;
    }


    /**
     * 根据索引查找
     *
     * @param index 索引
     * @return 找到，返回该索引位置节点的值
     * @Throws IllegalArgumentException 找不到，配出index非法异常
     */
    public int get(int index) {
        Node node = findNode(index);
        if (node == null) {
            throw new IllegalArgumentException(String.format("Illegal Argument: [%d]", index));
        }

        return node.value;
    }


    private Node findNode(int index) {
        int i = -1;
        for (Node p = head; p != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }

        return null;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new NodeIterator();
    }

    private class NodeIterator implements Iterator<Integer> {

        private Node p = head.next;

        @Override
        public boolean hasNext() {
            // 是否存在下一个元素
            return p != null;
        }

        @Override
        public Integer next() {
            // 返回当前值，并珍指向下一个元素
            int value = p.value;
            p = p.next;
            return value;
        }
    }


}
