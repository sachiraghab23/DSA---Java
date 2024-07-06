/*
Tree Map:
- keys are sorted
*/
import java.util.*;
public class TreeMapClass{
  public static void main(String[] args){
    TreeMap<String, Integer> tm = new TreeMap<>();
    tm.put("India",100);
    tm.put("China",150);
    tm.put("Nepal",29);
    System.out.println(tm);
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India",100);
    hm.put("China",150);
    hm.put("Nepal",29);
    System.out.println(hm);
  }
}


// java TreeMapClass.java