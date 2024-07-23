package LeetCode.LinkedList;

public class ReverseLinkedList_206_05 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = null;

        while (head != null) {
            ListNode p = head.next;
            head.next = newHead;
            newHead = head;
            head = p;
        }

        return newHead;
    }
}