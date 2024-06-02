public class StackClass{
  static class Node{
    int data;
    Node next;
    Node(int num){
      this.data = num;
      this.next = null;
    }
  }
  static class Stack{
    static Node head = null;
    boolean isEmpty(){
      return head == null;
    }
    //push
    void push(int num){
      Node newNode = new Node(num);
      if(isEmpty()){
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }
    //pop
    int pop(){
      if(isEmpty()){
        return -1;
      }
      int top = head.data;
      head = head.next;
      return top;
    }
    //peek
    int peek(){
      if(isEmpty()){
        return -1;
      }
      return head.data;
    }
  }
  public static void main(String[] args){
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    while(!stack.isEmpty()){
      System.out.println(stack.peek());
      stack.pop();
    }
  }
}

// java StackLinkedList.java