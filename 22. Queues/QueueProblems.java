/*
Q1. First non-repeating letter in a stream of characters.
Q2. Interleave 2 halves of a queue (even length)
Q3. Queue reversal.
*/
import java.util.*;
public class QueueProblems{
  public static void printNonRepeating(String str){
    int freq[] = new int[26]; //'a'-'z'
    Queue<Character> q = new LinkedList<>();
    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      q.add(ch);
      freq[ch-'a']++;
      while(!q.isEmpty() && freq[q.peek() - 'a']>1){
        q.remove();
      }
      if(q.isEmpty()){
        System.out.print("-1 ");
      }
      else{
        System.out.print(q.peek()+" ");
      }
    }
    System.out.println();
  }
  public static void interLeave(Queue<Integer> q){
    Queue<Integer> firstHalf = new LinkedList<>();
    int size = q.size();
    for(int i=0; i<size/2; i++){
      firstHalf.add(q.remove());
    }
    while(!firstHalf.isEmpty()){
      q.add(firstHalf.remove());
      q.add(q.remove());
    }
  }
  public static void reverseQueue(Queue<Integer> q){
    Stack<Integer> s = new Stack<>();
    while(!q.isEmpty()){
      s.push(q.remove());
    }
    while(!s.isEmpty()){
      q.add(s.pop());
    }
  }
  public static void main(String[] args){
    /*Q1 solution*/
    // String str = "aabccxb";
    // printNonRepeating(str);

    /*Q2 solution*/
    // Queue<Integer> q = new LinkedList<>();
    // q.add(1);
    // q.add(2);
    // q.add(3);
    // q.add(4);
    // q.add(5);
    // q.add(6);
    // q.add(7);
    // q.add(8);
    // q.add(9);
    // q.add(10);
    // interLeave(q);
    // while(!q.isEmpty()){
    //   System.out.print(q.remove()+" ");
    // }
    // System.out.println();

    /*Q3 solution*/
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    reverseQueue(q);
    while(!q.isEmpty()){
      System.out.print(q.remove()+" ");
    }
    System.out.println();
  }
}

// java QueueProblems.java