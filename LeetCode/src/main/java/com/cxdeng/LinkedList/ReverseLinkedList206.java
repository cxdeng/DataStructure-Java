package com.cxdeng.LinkedList;

public class ReverseLinkedList206 {

    /**
     * 方法1:
     * 构造一个新链表，从旧链表一次拿到每个节点，创建新节点添加至新链表头部
     *
     * @param head 旧链表
     * @return 返回反转的新链表
     */
    public static ListNode reverseList01(ListNode head) {
        ListNode newList = null;
        ListNode p = head;

        while (p != null) {
            newList = new ListNode(p.val, newList);
            p = p.next;
        }

        return newList;
    }


    /**
     * 方法2:
     * 构造一个新链表，从旧链表头部移除节点，添加到新链表头部，完成后新链表即是倒序的
     *
     * @param head 旧链表
     * @return 返回反转的新链表
     */
    public static ListNode reverseList02(ListNode head) {
        List list1 = new List(head);
        List list2 = new List(null);

        while (true) {
            ListNode firstNode = list1.removeFirst();
            if (firstNode == null) {
                break;
            }

            list2.addFirst(firstNode);
        }

        return list2.head;
    }


    static class List {
        ListNode head;

        public List(ListNode head) {
            this.head = head;
        }

        public void addFirst(ListNode node) {
            node.next = head;
            head = node;
        }

        public ListNode removeFirst() {
            ListNode delNode = head;
            if (delNode != null) {
                head = delNode.next;
            }

            return delNode;
        }
    }


    /**
     * 方法3:
     * 使用递归反转链表
     *
     * @param p 旧链表
     * @return 返回反转的新链表
     */
    public static ListNode reverseList03(ListNode p) {

        if (p == null || p.next == null) {
            return p;
        }

        ListNode lastNode = reverseList03(p.next);
        p.next.next = p;
        p.next = null;

        return lastNode;
    }


    /**
     * 方法4:
     * 从链表每次拿到第二个节点，将其从链表断开，插入头部，直到它为null结束
     *
     * @return 返回反转的新链表
     */
    public static ListNode reverseList04(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode o1 = head;
        ListNode o2 = o1.next;
        ListNode n1 = o1;

        while (o2 != null) {
            o1.next = o2.next;
            o2.next = n1;
            n1 = o2;
            o2 = o1.next;
        }

        return n1;
    }


    /**
     * 方法5:
     * 把链表分成两部分，不断从链表2的头，往链表1的头搬移
     *
     * @param head 旧链表
     * @return 返回反转的新链表
     */
    public static ListNode reverseList05(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode o1 = head;
        ListNode n1 = null;

        while (o1 != null) {
            ListNode o2 = o1.next;
            o1.next = n1;
            n1 = o1;
            o1 = o2;
        }

        return n1;
    }
}
