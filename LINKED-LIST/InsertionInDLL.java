

public class InsertionInDLL {
  import java.util.* ;
import java.io.*; 

/************************************************************

 Following is the linkedList class structure:

 class Node<T> {
 T data;
 Node<T> next,prev;

 public Node(T data) {
 this.data = data;
 }
 }

 ************************************************************/



    static Node insert(int k, int val, Node head) {
      if(head == null ){
          return new Node (val); 
      }
      Node newNode =  new Node (val);
      if(k == 0){
        newNode.next = head;
        return newNode;
      }

      int count = 0;
        Node temp = head;
      while(temp != null){
          if(count == k-1){
              newNode.next = temp.next;
              newNode.prev = temp;
               if (temp.next != null) {
                    temp.next.prev = newNode;
                }
              temp.next = newNode;

              return head;
          }
          count++;
          temp = temp.next;
      }
        return head;
    }
}

