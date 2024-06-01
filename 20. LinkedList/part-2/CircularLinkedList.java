public class CircularLinkedList{
  public class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
    }
  }
  public void addFirst(Node last,int n){
    Node newNode = new Node(n);
    if(last == null){
      last = newNode;
      newNode.next = last;
      return last;
    }
    newNode.next = last.next;
    last.next = newNode;
    return last;
  }
  public void addLast(Node last,int n){
    Node newNode = new Node(n);
    if(last == null){
      last = newNode;
      newNode.next = last;
      return last;
    }
    newNode.next = last.next;
    last.next = newNode;
    last = newNode;
    return last;
  }
  public int removeFirst(){
    if(head == null){
      System.out.println("cll is empty");
      return Integer.MIN_VALUE;
    }
    if(size == 1){
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }
    int val = head.data;
    head = head.next;
    head.prev = null;
    size--;
    return val;
  }
  public void print(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + "<->");
      temp = temp.next;
    }
    System.out.println("null");
  }
  public void reverse(){
    Node curr = head;
    Node prev = null;
    Node next;
    while(curr != null){
      next = curr.next;
      curr.next = prev;
      curr.prev = next;
      prev = curr;
      curr = next;
    }
    head = prev;
  }
  public static void main(String[] args){
    CircularLinkedList cll = new CircularLinkedList();
    cll.addFirst(5);
    cll.addFirst(4);
    cll.addFirst(3);
    cll.addFirst(2);
    cll.addFirst(1);
    // cll.removeFirst();
    cll.print();
    cll.reverse();
    cll.print();
  }
}

// java CircularLinkedList.java