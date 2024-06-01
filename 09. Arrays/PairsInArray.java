/* 
Print pairs of given array elements 
Time complexity: O(n^2)
*/
public class PairsInArray{
  public static void printPairs(int arr[]){
    for(int i = 0; i < arr.length - 1; i++){
      for(int j = i + 1; j < arr.length; j++){
        System.out.print("(" + arr[i] + "," + arr[j] + ") ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    int numbers[] = {2, 4, 6, 8, 9};
    printPairs(numbers);
  } 
}

// java PairsInArray.java