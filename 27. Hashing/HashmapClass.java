import java.util.*;
public class HashmapClass{
  public static void main(String[] args){
    //Create
    HashMap<String, Integer> hm = new HashMap<>();
    //inserting
    hm.put("India",100);
    hm.put("China",150);
    hm.put("USA",75);
    hm.put("German",45);
    System.out.println(hm);

    //get - O(1)
    int population = hm.get("India");
    System.out.println(population);
    System.out.println(hm.get("india"));

    //containsKey - O(1)
    System.out.println(hm.containsKey("India"));
    System.out.println(hm.containsKey("Nepal"));

    //remove 
    System.out.println(hm.remove("China"));
    System.out.println(hm.remove("Chna"));

    //size
    System.out.println("size = "+hm.size());

    //isEmpty
    System.out.println(hm.isEmpty());

    //clear
    hm.clear();
    System.out.println(hm.size());
  }
}

// java HashmapClass.java