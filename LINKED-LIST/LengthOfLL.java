
class Node {
  public int data;
  public Node next;

  Node()
  {
      this.data = 0;
      this.next = null;
  }

  Node(int data)
  {
      this.data = data;
      this.next = null;
  }

  Node(int data, Node next)
  {
      this.data = data;
      this.next = next;
  }
};

public class LengthOfLL {
  public static int length(Node head){
    int count = 1;
    Node temp = head;
    while(temp.next !=  null){
        temp = temp.next;
        count++;
    }
    return count;
}
}
