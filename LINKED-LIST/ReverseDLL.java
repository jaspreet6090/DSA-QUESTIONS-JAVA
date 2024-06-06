public class ReverseDLL {
  /****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

import java.util.*;


    public static Node reverseDLL(Node head)
    {
        if(head == null || head.next == null){
            return head;
        }
        
        Node curr = head;
        Node last = null;

        while(curr != null){
            last = curr.prev;
            curr.prev = curr.next;
            curr.next = last;

            curr = curr.prev; //as we reversed    
        }


    return last.prev;



        //Brute Force using a Stack - TC- O(n2)
    //    Node temp = head ;
    //    Stack<Integer> stack = new Stack<>();

    //    while(temp!= null){
    //        stack.push(temp.data);
    //        temp = temp.next;
    //    }

    //    temp = head;
    //    while(temp!= null){
    //        temp.data = stack.pop();
    //        temp = temp.next;
    //    }

    //    return head;
    }
}

