/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengtha=length(headA);
        int lengthb=length(headB);
        ListNode firstA = headA;
        ListNode firstB = headB;
        while(lengtha > lengthb){
            firstA = firstA.next;
            lengtha--;
        }
        while(lengthb > lengtha){
            firstB = firstB.next;
            lengthb--;
        }
        while(firstA != firstB){
            firstA = firstA.next;
            firstB = firstB.next;
        }
        return firstA;
    }
    private int length(ListNode node) {
    int length = 0;
    while (node != null) {
        node = node.next;
        length++;
    }
    return length;
}
}
