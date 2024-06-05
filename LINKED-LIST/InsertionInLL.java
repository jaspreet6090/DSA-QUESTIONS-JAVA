
public class InsertionInLL {
  /************************************************************
   * 
   * Following is the linkedList class structure:
   * 
   * class Node<T> {
   * T data;
   * Node<T> next;
   * 
   * public Node(T data) {
   * this.data = data;
   * }
   * }
   * 
   ************************************************************/

  public class Solution {

    static Node insert(Node head, int n, int pos, int val) {
      Node newNode = new Node(val);

      if (pos == 0) {
        newNode.next = head;
        return newNode;
      }

      int count = 0;
      Node temp = head;

      while (temp != null) {
        if (count == pos - 1) {
          newNode.next = temp.next;
          temp.next = newNode;
          return head;
        }
        count++;
        temp = temp.next;
      }

      if (count == pos - 1) {
        temp.next = newNode;
      }

      return head;
    }
  }
}
