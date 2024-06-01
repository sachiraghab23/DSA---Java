public class LinkedListCycle{
  public static class Node{
    int data;
    Node next;
    Node(int n){
      this.data = n;
      this.next = null;
    }
  }
  public static boolean isCycle(Node head){ //Floyd's CycleFinding Algorithm
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast){
        return true; //cycle exists
      }
    }
    return false; //cycle doesn't exist
  }
  public static void removeCycle(Node head){
    //detect cycle
    Node slow = head;
    Node fast = head;
    boolean cycleFound = false;
    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
      if(fast == slow){
        cycleFound = true;
        break;
      }
    }
    if(cycleFound == false){
      return;
    }
    //find the meeting point
    slow = head;
    Node prev = null;
    while(slow != fast){
      prev = fast;
      slow  = slow.next;
      fast = fast.next;
    }
    //remove cycle
    prev.next = null;
  }
  public static void main(String[] args){
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = head.next;
    System.out.println(isCycle(head));
    removeCycle(head);
    System.out.println(isCycle(head));
  }
}

// java LinkedListCycle.java