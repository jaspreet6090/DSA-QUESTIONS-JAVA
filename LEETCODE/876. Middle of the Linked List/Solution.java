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
    public ListNode middleNode(ListNode head) {
         //Two Pointer (Slow & Fast)
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;



        // // Brute Force Solution
        // if (head.next == null)
        //     return head;

        // int count = 0;
        // Node temp = head;

        // while (temp != null) {
        //     temp = temp.next;
        //     count++;
        // }

        // int mid = 0;

        // if (count / 2 == 0)  mid = count / 2 + 1;
        // else  mid = count / 2;
        
        // temp = head;
        // count = 0;

        // while (count != mid) {
        //     temp = temp.next;
        //     count++;
        // }

        // return temp;
    }
}