/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Boolean> map = new HashMap<>();
        ListNode cur = head;
        if (head == null) {
            return false;
        }
        do {
            if (map.getOrDefault(cur, false) == true) {
                return true;
            }
            map.put(cur, true);
            cur = cur.next;
        } while (cur != null);
        return false;
    }
}
