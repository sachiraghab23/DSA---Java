/* 
Print sub-arrays of given array. 
Time complexity: O(n^2)
*/
public class PairsInArray{
  public static void printSubarrays(int arr[]){
    for(int i = 0; i < arr.length - 1; i++){
      int si = i;
      for(int j = i; j < arr.length; j++){
        int ei = j;
        for(int k = si; k <= ei; k++){
          System.out.print(arr[k] + " ");
        }
        System.out.println();
      }
    }
  }
  public static void printSubarraySum(int arr[]){
    for(int i = 0; i < arr.length - 1; i++){
      int si = i;
      for(int j = i; j < arr.length; j++){
        int ei = j;
        int sum = 0;
        for(int k = si; k <= ei; k++){
          sum += arr[k];
        }
        System.out.println("sum: " + sum);
      }
    }
  }
  public static void main(String[] args){
    int numbers[] = {2, 4, 6, 8, 9};
    // printSubarrays(numbers);
    printSubarraySum(numbers);
  } 
}

// java Subarrays.java