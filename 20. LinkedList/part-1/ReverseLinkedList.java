/*
Reverse linked list:
- Reverse the given linked list.
*/
public class ReverseLinkedList{
  public static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  public static class LinkedList{
    Node head;
    //Iterative approach  
    void reverse(){
      Node prev = null;
      Node curr = head;
      Node next;
      while(curr != null){
        next = curr.next;
        curr.next= prev;
        prev = curr;
        curr = next;
      }
      head = prev;
    }
    void removeNthFromEnd(int n){
      int size = 0;
      Node temp = head;
      while(temp != null){
        temp = temp.next;
        size++;
      }
      if(n == size){
        head = head.next; //removeFirst
        return;
      }
      //size - n
      int i = 1;
      Node prev = head;
      int iToFind = size - n;
      while(i < iToFind){
        prev = prev.next;
        i++;
      }
      prev.next = prev.next.next;
      return;
    }
    void push(int data){
      Node newNode = new Node(data);
      newNode.next = head;
      head = newNode;
    }
    void printList(){
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
  }  
  public static void main(String[] args){
    LinkedList list = new LinkedList();
    list.push(1);
    list.push(2);
    list.push(3);
    list.push(4);
    list.push(5);
    list.push(6);
    list.printList();
    // list.reverse();
    list.removeNthFromEnd(3);
    list.printList();
  }
}

// java ReverseLinkedList.java