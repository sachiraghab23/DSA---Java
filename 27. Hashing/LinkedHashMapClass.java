import java.util.*;
public class LinkedHashMapClass{
  public static void main(String[] args){
    LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
    lhm.put("India",100);
    lhm.put("China",150);
    lhm.put("Nepal",29);
    System.out.println(lhm);
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India",100);
    hm.put("China",150);
    hm.put("Nepal",29);
    System.out.println(hm);
  }
}


// java LinkedHashMapClass.java