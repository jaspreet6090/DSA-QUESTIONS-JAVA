

public class DeletionInDLL {
  import java.util.* ;
import java.io.*; 

/************************************************************
 
Following is the linkedList class structure:


class Node<T> {
T data;
Node<T> next;
Node<T> prev;

public Node(T data) {
this.data = data;
}
}
 ************************************************************/



    static Node deleteNode(Node head, int pos) {
        
        if (head == null) return null;

        int count = 0;
        Node Knode = head;

        while (Knode != null && count < pos) {
            Knode = Knode.next;
            count++;
        }

        // Handle deleting the head node
        if (Knode == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        // Handle deleting the last node or a node in the middle
        if (Knode != null) {
            Node front = Knode.next;
            Node back = Knode.prev;

            if (front != null) {
                front.prev = back;
            }
            if (back != null) {
                back.next = front;
            }
        }

        return head;
    }
}
  

