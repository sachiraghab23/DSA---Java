public class LinkedList{
  public static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int size;
  public void addFirst(int data){
    Node newNode = new Node(data);
      size++;
    if(head == null){
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
    //TC: O(1)
  }
  public int removeFirst(){
    if(head == null){
      System.out.println("Linked list is empty");
      return Integer.MIN_VALUE;
    }else if(head.next == null){
      int val = head.data;
      head = tail = null;
      size=0;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
    //TC: O(1)
  }
  public void addLast(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
    //TC: O(1)
  }
  public int removeLast(){
    if(head == null){
      System.out.println("Linked list is empty");
      return Integer.MIN_VALUE;
    }else if(head.next == null){
      int val = head.data;
      head = tail = null;
      size=0;
      return val;
    }
    Node prev = head;
    for(int i=0; i<size-2; i++){
      prev =prev.next;
    }
    int val = prev.next.data; //tail.data
    prev.next = null;
    tail = prev;
    size--;
    return val;
    //TC: O(1)
  }
  public void add(int index,int data){
    if(index == 0){
      addFirst(data);
      return;
    }
    size++;
    Node newNode = new Node(data);
    Node temp = head;
    int i = 0;
    while(i < index-1){
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
    //TC: O(n)
  }
  public void printList(){
    if(head == null){
      System.out.println("No list found");
      return;
    }
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+"->");
      temp = temp.next;
    }
    System.out.println("null");
    //TC: O(n)
  }
  public static void main(String[] args){
    LinkedList ll = new LinkedList();
    ll.addFirst(2);
    ll.printList();
    ll.addFirst(1);
    ll.printList();
    ll.addLast(3);
    ll.printList();
    ll.addLast(4);
    ll.printList();
    ll.add(2,9);
    ll.printList();
    System.out.println(ll.size);
    ll.removeFirst();
    ll.removeLast();
    ll.printList();
    System.out.println(ll.size);
    // System.out.println(ll.itrSearch(3));
    // System.out.println(ll.itrSearch(8));
    System.out.println(ll.recSearch(3));
    System.out.println(ll.recSearch(8));
  }  
}

// java LinkedList.java