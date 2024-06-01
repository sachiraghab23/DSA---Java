public class DoublyLinkedList{
  public class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int size;
  public void addFirst(int n){
    Node newNode = new Node(n);
    size++;
    if(head == null){
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
  }
  public int removeFirst(){
    if(head == null){
      System.out.println("DLL is empty");
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
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.addFirst(5);
    dll.addFirst(4);
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);
    // dll.removeFirst();
    dll.print();
    dll.reverse();
    dll.print();
  }
}

// java DoublyLinkedList.java