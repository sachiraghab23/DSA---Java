public class CircularQueue{
  static class Queue{
    static int arr[];
    static int size;
    static int rear;
    static int front;
    Queue(int n){
      arr = new int[n];
      size = n;
      rear = -1;
      front = -1;
    }
    public static boolean isEmpty(){
      return rear == -1 && front == -1;
    }
    public static boolean isFull(){
      return (rear+1)%size == front;
    }
    //add
    public static void add(int data){
      if(isFull()){
        System.out.println("queue is full");
        return;
      }
      //adding 1st element
      if(front == -1){
        front = 0;
      }
      rear = (rear+1)%size;
      arr[rear] = data;
    }
    //remove
    public static int remove(){
      if(isEmpty()){
        System.out.println("empty queue");
        return -1;
      }
      int result = arr[front];
      //deleting last element
      if(rear == front){
        rear = front = -1;
      }else{
        front = (front +1)%size;
      }
      return result;
    }
    //peek
    public static int peek(){
      if(isEmpty()){
        System.out.println("empty queue");
        return -1;
      }
      return arr[front];
    }
  }
  public static void main(String[] args){
    Queue cq = new Queue(5);
    cq.add(1);
    cq.add(2);
    cq.add(3);
    System.out.println(cq.remove());
    cq.add(4);
    System.out.println(cq.remove());
    cq.add(5);
    while(!cq.isEmpty()){
      System.out.println(cq.peek());
      cq.remove();
    }
  }
}

// java CircularQueue.java