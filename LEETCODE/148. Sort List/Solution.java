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
    public ListNode mid(ListNode head){
       ListNode slow = head;
       ListNode fast = head;

       while(fast.next != null && fast.next.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }

       return slow;
    }

   public ListNode merge(ListNode left_half,ListNode right_half){
       if(left_half == null || right_half == null){
           return (left_half == null)? right_half : left_half;
       }

       ListNode ans = new ListNode(0);
       ListNode curr = ans;

       while(left_half != null && right_half != null){
           if(left_half.val > right_half.val){
               curr.next = right_half;
               right_half = right_half.next;   
           }else{
                curr.next = left_half;
               left_half = left_half.next;
           }
           curr = curr.next;
       }

       if(left_half != null || right_half != null){
          curr.next =  (left_half != null)? left_half : right_half;
       }

       return ans.next;
   }


   public ListNode sortList(ListNode head) {
       if(head == null || head.next == null) return head;

       ListNode mid = mid(head);
       ListNode newhead = mid.next;
       mid.next = null;

       ListNode left_half = sortList(head);
       ListNode right_half = sortList(newhead);

       return merge(left_half,right_half);
   }
}

