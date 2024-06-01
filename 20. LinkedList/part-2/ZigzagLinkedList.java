/*
Q. For a linked list of the form l1->l2->l3->l4 convert it into a zig-zag form i.e. l1->l4->l2->l3
For e.g. 1,2,3,4,5 becomes 1,5,2,4,3 
*/

public class ZigzagLinkedList{
  public class Node{
    int data;
    Node next;
    Node(int n){
      this.data = n;
      this.next = null;
    }
  }
  Node head;
  public void push(int n){
    Node newNode = new Node(n);
    newNode.next = head;
    head = newNode;
  }
  public void printList(){
    Node curr = head;
    while(curr != null){
      System.out.print(curr.data+"->");
      curr = curr.next;
    }
    System.out.println("null");
  }
  public void zigzag(){
    Node slow = head;
    Node fast = head.next;
    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    Node mid = slow;
    //reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;
    while(curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node left = head;
    Node right = prev;
    Node nextL, nextR;
    //alt merge -> zigzag merge
    while(left != null && right != null){
      nextL = left.next;
      left.next = right;
      nextR = right.next;
      right.next = nextL;
      left = nextL;
      right = nextR;
    }
  }
  public static void main(String[] args){
    ZigzagLinkedList list = new ZigzagLinkedList();
    list.push(1);
    list.push(2);
    list.push(3);
    list.push(4);
    list.push(5);
    list.push(6);
    list.printList();
    list.zigzag();
    list.printList();
  }
}

// java ZigzagLinkedList.java