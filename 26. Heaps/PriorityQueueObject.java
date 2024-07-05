/* sorting java objects based on priority */
import java.util.PriorityQueue;
import java.util.Comparator;
public class PriorityQueueObject{
  static class Student implements Comparable<Student>{ //overriding
    String name;
    int rank;
    public Student(String name, int rank){
      this.name = name;
      this.rank = rank;
    }
    @Override
    public int compareTo(Student s2){
      return this.rank - s2.rank;
    }
  }
  public static void main(String[] args){
    //for reverse order
    PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
    // PriorityQueue<Student> pq = new PriorityQueue<>();
    pq.add(new Student("A", 4)); //O(logn)
    pq.add(new Student("B", 5));
    pq.add(new Student("C", 2));
    pq.add(new Student("D", 3));
    while(!pq.isEmpty()){
      System.out.println(pq.peek().name + " -> "+pq.peek().rank); //O(1)
      pq.remove(); //O(logn)
    }
  }
}

// java PriorityQueueObject.java