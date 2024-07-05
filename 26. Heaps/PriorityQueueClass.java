import java.util.PriorityQueue;
public class PriorityQueueClass{
  public static void main(String[] args){
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(3); //O(logn)
    pq.add(4);
    pq.add(1);
    pq.add(7);
    while(!pq.isEmpty()){
      System.out.println(pq.peek()); //O(1)
      pq.remove(); //O(logn)
    }
  }
}

// java PriorityQueueClass.java