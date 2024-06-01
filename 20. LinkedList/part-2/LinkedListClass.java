import java.util.LinkedList;

public class LinkedListClass{
  public static void main(String[] argsd){
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addFirst(0);
    System.out.println(list);
    list.removeLast();
    list.removeFirst();
    System.out.println(list);
  }
}

//java LinkedListClass.java