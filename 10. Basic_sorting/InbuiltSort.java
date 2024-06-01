import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort{
  public static void sortAscend(Integer arr[]){
    Arrays.sort(arr);
  }
  public static void sortDescend(Integer arr[]){
    Arrays.sort(arr, Collections.reverseOrder());
  }
  public static void printArr(Integer arr[]){
    int n = arr.length;
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args){
    Integer nums[] = {3,1,6,2,4,5};
    // sortAscend(nums);
    sortDescend(nums);
    System.out.println("After sorting,");
    printArr(nums);
  }
}

// java InbuiltSort.java
// time complexity: O(nlogn)