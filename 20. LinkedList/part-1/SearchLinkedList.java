/*
Searching in Linked list:
- Search for a key in a linked list. Return the position where it is found. If not found, return -1.
*/
public class SearchLinkedList{
  public static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  //Iterative approach
  public static int itrSearch(Node head,int key){
    Node temp = head;
    int i=0;
    while(temp != null){
      if(temp.data == key){//key found
        return i;
      }
      temp = temp.next;
      i++;
    }
    return -1;
  }
  //Recursive approach
  public static int recSearch(Node head,int key){
    return searchHelper(head,key);
  }
  public static int searchHelper(Node head,int key){
    if(head == null){
      return -1;
    }
    if(head.data == key){
      return 0;
    }
    int idx = searchHelper(head.next,key);
    if(idx == -1){
      return -1;
    }
    return idx+1;
  }  
  public static void push(Node head,int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }
  public static void printList(Node head){
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
    Node head = new Node(1);
    push(head,2);
    push(head,3);
    push(head,4);
    push(head,5);
    push(head,6);
    printList(head);
    // System.out.println(itrSearch(head,3));
    // System.out.println(itrSearch(head,8));
    System.out.println(recSearch(head,3));
    System.out.println(recSearch(head,8));
  }
}

// java SearchLinkedList.java