/*
Q. Sort all elements of an arraylist
*/
import java.util.ArrayList;
import java.util.Collections;
public class SortAL{
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(5);
    list.add(9);
    list.add(6);
    list.add(3);
    System.out.println(list);
    Collections.sort(list); //asending
    System.out.println(list);
    Collections.sort(list,Collections.reverseOrder()); //desending
    System.out.println(list);
  }
}

// java SortAL.java