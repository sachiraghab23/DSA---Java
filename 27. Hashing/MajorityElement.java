/*
Q. Majority element:
  - Given an integer array of size n, find all elements that appear more than [n/3] times.
*/
import java.util.*;
public class MajorityElement{
  public static void main(String[] args){
    int arr[] = {1,3,2,5,1,3,1,5,1};
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<arr.length; i++){
      map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
    }
    Set<Integer> keySet = map.keySet();
    for(Integer key : keySet){
      if(map.get(key) > arr.length/3){
        System.out.println(key);
      }
    }
  }
}

// java MajorityElement.java