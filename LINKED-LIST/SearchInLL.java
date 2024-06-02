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

public class SearchInLL {
  public static int searchInLinkedList(Node head, int k)
    {
        Node temp = head;

        while(temp != null){
            if(temp.data == k){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
}
