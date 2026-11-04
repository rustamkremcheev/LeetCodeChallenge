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

    public int getVal(ListNode node) {
        if (node == null) return Integer.MAX_VALUE;
        return node.val; 
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {        
        
        ListNode cur = new ListNode();
        ListNode stub = cur;

        while (list1 != null || list2 != null) {
            if (getVal(list1) < getVal(list2)) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        return stub.next;
    }
}