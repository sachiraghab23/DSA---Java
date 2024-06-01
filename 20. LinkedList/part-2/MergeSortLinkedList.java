public class MergeSortLinkedList{
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
    public Node mergeSort(Node head){
      if(head == null || head.next == null){
        return head;
      }
      Node mid = getMid(head);
      Node rightHead = mid.next;
      mid.next = null;
      Node newLeft = mergeSort(head);
      Node newRight = mergeSort(rightHead);
      //merge
      return merge(newLeft,newRight);
    }
    private Node getMid(Node head){
      Node slow = head;
      Node fast = head.next;
      while(fast != null && fast.next != null){
        slow = slow.next; //+1
        fast = fast.next.next; //+2
      }
      return slow; //slow is the midnode
    }
    private Node merge(Node head1, Node head2){
      Node mergeLL = new Node(-1);
      Node temp = mergeLL;
      while(head1 != null && head2 != null){
        if(head1.data <= head2.data){
          temp.next = head1;
          head1 = head1.next;
        }
        else{
          temp.next = head2;
          head2 = head2.next;
        }
          temp = temp.next;
      }
      while(head1 != null){
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
      }
      while(head2 != null){
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }
      return mergeLL.next;
    }
  }

  public static void main(String[] args){
    LinkedList list = new LinkedList();
    list.push(1);
    list.push(2);
    list.push(3);
    list.push(4);
    list.push(3);
    list.push(2);
    list.printList();
    list.head = list.mergeSort(list.head);
    list.printList();
  }
}

// java MergeSortLinkedList.java