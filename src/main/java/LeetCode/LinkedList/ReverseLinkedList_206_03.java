package LeetCode.LinkedList;

public class ReverseLinkedList_206_03 {

    public ListNode reverseList(ListNode p) {
        if (p == null || p.next == null) {
            // If the node is the last one, then, return.
            return p;
        }

        ListNode lastNode = reverseList(p.next);
        p.next.next = p;
        p.next = null;

        return lastNode;
    }
}