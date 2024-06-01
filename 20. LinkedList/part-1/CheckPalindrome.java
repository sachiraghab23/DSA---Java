public class CheckPalindrome{
  public static class Node{
    int data;
    Node next;
    Node(int n){
      this.data = n;
      this.next = null;
    }
  }
  public static class LinkedList{
    Node head;
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
    void push(int n){
      Node newNode = new Node(n);
      newNode.next = head;
      head = newNode;
    }
    boolean isPalindrome(){
      if(head == null || head.next == null){
        return true;
      }
      //find mid
      Node midNode = findMid(head);
      //reverse 2nd half
      Node prev = null;
      Node curr = midNode;
      Node next;
      while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
      }
      Node right = prev; //right half head
      Node left = head;
      //check left half & right half
      while(right != null){
        if(left.data != right.data){
          return false;
        }
        left = left.next;
        right = right.next;
      }
      return true;
    }
    public Node findMid(Node head){
      Node slow = head;
      Node fast = head;
      while(fast != null && fast.next != null){
        slow = slow.next; //+1
        fast = fast.next.next; //+2
      }
      return slow; //slow is the midnode
    }
  }
  public static void main(String[] args){
    LinkedList list = new LinkedList();
    // list.push(1);
    list.push(2);
    list.push(3);
    list.push(4);
    list.push(3);
    list.push(2);
    if(list.isPalindrome()){
      System.out.println("palindrome");
    }
    else{
      System.out.println("Not palindrome");
    }
  }
}

// java CheckPalindrome.java