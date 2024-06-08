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
    //recurive
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverse(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    public ListNode reverseList(ListNode head) {

        //iterative
        if(head == null) return null;
        if(head.next == null) return head;

       ListNode temp = head;
       ListNode prev = null;

       while(temp!=null){
           ListNode last = temp.next;
           temp.next = prev;
           prev = temp;
           temp = last;
       }

       return prev;

       

    }
}