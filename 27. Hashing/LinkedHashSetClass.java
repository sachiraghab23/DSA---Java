import java.util.*;
public class LinkedHashSetClass{
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
  }
}

// java LinkedHashSetClass.java