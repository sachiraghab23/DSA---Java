/*
Q. Swap 2 elements of an arraylist
*/
import java.util.ArrayList;
public class SwapAL{
  public static void swap(ArrayList<Integer> list,int m, int n){
    int temp = list.get(m);
    list.set(m, list.get(n));
    list.set(n, temp);
  }
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(5);
    list.add(9);
    list.add(6);
    list.add(8);
    System.out.println(list);
    swap(list,1,3);
    System.out.println(list);
  }
}

// java SwapAL.java