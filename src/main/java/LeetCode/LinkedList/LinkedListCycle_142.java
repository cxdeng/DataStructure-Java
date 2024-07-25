package LeetCode.LinkedList;

public class LinkedListCycle_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode low = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;

            if (low == fast){
                low = head;
                while (low != fast){
                    low = low.next;
                    fast = fast.next;
                }
                return low;
            }
        }

        return null;
    }
}
