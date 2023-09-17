package com.cxdeng;

import java.util.Iterator;
import java.util.function.Consumer;

/*
 * 单向链表
 * */
public class SinglyLinkedList implements Iterable<Integer> {

    // 头指针
    private Node head = null;


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
        // 情况1: 链表为空
        //head = new Node(value, null);

        // 情况2: 链表非空
        head = new Node(value, head);
    }


    /**
     * 向尾部添加
     *
     * @param value 待添加值
     */
    public void addLast(int value) {
        // 若链表为空
        if (head == null) {
            head = new Node(value, null);
            return;
        }

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
        // 若索引为 0, 则插入到链表头部
        if (index == 0) {
            head = new Node(value, head);
            return;
        }

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
        // 若链表为空，则抛出异常
        if (head == null) {
            throw new IllegalArgumentException(String.format("Illegal Argument: [%d]", 0));
        }

        // head 指向第二个节点
        head = head.next;
    }


    public void remove(int index) {
        if (index == 0) {
            // 情况1: 删除第0个节点
            head = head.next;
            return;
        }

        Node prevNode = findNode(index - 1);
        if (prevNode == null) {
            // 情况2: index不合法，找不到前置节点
            throw new IllegalArgumentException(String.format("Illegal Argument: [%d]", index));
        }

        // 待删除的节点
        Node delNode = prevNode.next;
        if (delNode == null) {
            // 情况3: 前置节点为最后一个节点，因此没有待删除节点，index不合法
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
        int i = 0;
        for (Node p = head; p != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }

        return null;
    }


    public void whileLoop(Consumer<Integer> consumer) {
        Node p = head;
        while (p != null) {
            consumer.accept(p.value);
            p = p.next;
        }
    }


    public void forLoop(Consumer<Integer> consumer) {
        for (Node p = head; p != null; p = p.next) {
            consumer.accept(p.value);
        }
    }


    @Override
    public Iterator<Integer> iterator() {

        // 匿名内部类
        return new Iterator<Integer>() {
            Node p = head;

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
        };
    }
}



