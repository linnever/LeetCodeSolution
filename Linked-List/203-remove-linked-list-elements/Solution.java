/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

 public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val) head = head.next;
        if(head == null) return null;
        ListNode cur = head;
       while(cur !=null && cur.next != null) {
            if(cur.next.val == val)
            cur.next = cur.next.next;
            else cur = cur.next;
        }
        return head;
    }
}
 //clean way.
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;

        }
}
