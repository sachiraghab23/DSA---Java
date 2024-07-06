import java.util.*;
public class TreeSetClass{
  public static void main(String[] args){
    HashSet<String> cities = new HashSet<>();
    cities.add("Delhi");
    cities.add("Mumbai");
    cities.add("Noida");
    cities.add("Bengaluru");
    cities.add("Chennai");
    System.out.println(cities);

    LinkedHashSet<String> lhs = new LinkedHashSet<>();
    lhs.add("Delhi");
    lhs.add("Mumbai");
    lhs.add("Noida");
    lhs.add("Bengaluru");
    lhs.add("Chennai");
    System.out.println(lhs);

    TreeSet<String> ts = new TreeSet<>();
    ts.add("Delhi");
    ts.add("Gurgaon");
    ts.add("Mumbai");
    ts.add("Bengaluru");
    ts.add("Chennai");
    System.out.println(ts);
  }
}

// java TreeSetClass.java