package LeetCode.LinkedList;

public class LinkedListCycle_141 {
    public boolean hasCycle(ListNode head) {
        ListNode low = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;

            if (low == fast){
                return true;
            }
        }

        return false;
    }
}
