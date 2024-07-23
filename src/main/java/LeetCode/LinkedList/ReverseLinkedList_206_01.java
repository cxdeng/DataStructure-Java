package LeetCode.LinkedList;

public class ReverseLinkedList_206_01 {

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode p = head;

        while (p != null) {
            newHead = new ListNode(p.val, newHead);
            p = p.next;
        }

        return newHead;
    }
}