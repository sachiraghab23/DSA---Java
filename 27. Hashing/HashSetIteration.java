/*
Iteration on HashSet:
- using iterators
- using enhanced for loop
*/

import java.util.*;
public class HashSetIteration{
  public static void main(String[] args){
    HashSet<String> cities = new HashSet<>();
    cities.add("Delhi");
    cities.add("Mumbai");
    cities.add("Noida");
    cities.add("Bengaluru");
    cities.add("Chennai");
    //approach - 1
    Iterator it = cities.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
    //approach - 2
    for(String city: cities){
      System.out.println(city);
    }
  }
}

// java HashSetIteration.java