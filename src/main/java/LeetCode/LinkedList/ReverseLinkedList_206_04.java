package LeetCode.LinkedList;

public class ReverseLinkedList_206_04 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head;
        ListNode p = head.next;
        while (p != null) {
            head.next = p.next;
            p.next = newHead;
            newHead = p;
            p = head.next;
        }

        return newHead;
    }
}