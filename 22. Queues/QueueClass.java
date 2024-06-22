import java.util.*;
public class QueueClass{
  public static void main(String[] args){
    Queue<Integer> q1 = new LinkedList<>();
    q1.add(1);
    q1.add(2);
    q1.add(3);
    while(!q1.isEmpty()){
      System.out.println(q1.peek());
      q1.remove();
    }
    Queue<Integer> q2 = new ArrayDeque<>();
    q2.add(4);
    q2.add(5);
    q2.add(6);
    while(!q2.isEmpty()){
      System.out.println(q2.peek());
      q2.remove();
    }
  }
}

// java QueueClass.java