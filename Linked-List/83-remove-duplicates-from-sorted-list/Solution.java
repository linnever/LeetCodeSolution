/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode first = head;
        while(first != null){
        while(first.next != null && first.val == first.next.val){
            first.next = first.next.next;
           }
           first = first.next;
        }
        return head;
    }
}
