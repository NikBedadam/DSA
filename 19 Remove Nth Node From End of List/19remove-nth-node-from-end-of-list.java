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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n == 0) return head;
        int length = 0;
        ListNode node = head;
        while(node != null){
            length++;
            node = node.next;
        }
        if(length == n){
            return head.next;
        }
        int k = length - n;
        node = head;
        while(k > 1){
            node = node.next;
            k--;
        }
        if(node.next != null){
            node.next = node.next.next;
        }
        return head;
    }
}