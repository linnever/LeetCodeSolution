/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
        return true;
        int length = 0;
        ListNode dummy = head;
        while(dummy != null){
            length++;
            dummy=dummy.next;
        }
        ListNode current = head;
        ListNode front = head.next;
        head.next = null;
        int count = 2;
        while (count<=length/2){
            ListNode copy = front.next;
            front.next = current;
            current = front;
            front = copy;
            count++;
    }
    if (length%2 == 1)
    front = front.next;
    while(front!=null && front.val==current.val){
        current=current.next;
        front=front.next;
    }
    if(front == dummy)
    return true;
    return false;
    }
}
