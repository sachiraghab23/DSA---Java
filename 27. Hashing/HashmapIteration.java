import java.util.*;
public class HashmapIteration{
  public static void main(String[] args){
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 100);
    hm.put("China", 140);
    hm.put("USA", 65);
    hm.put("German", 73);
    hm.put("London", 92);

    //iterate
    Set<String> keys = hm.keySet();
    System.out.println(keys);

    for(String k: keys){
      System.out.println("key = "+k+", value = "+hm.get(k));
    }
  }
}

// java HashmapIteration.java