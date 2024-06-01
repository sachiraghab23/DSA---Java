/*
Q. Check if a given array is sorted or not.
*/
public class SortedArray{
  public static boolean isSorted(int arr[],int i){
    //base case
    if(i == arr.length - 1){
      return true;
    }
    //action
    if(arr[i] > arr[i+1]){
      return false;
    }
    // recursion
    return isSorted(arr,i+1);
  }  
  public static void main(String[] args){
    int num[] = {1,2,3,4,9,5};
    System.out.println(isSorted(num,0));
  }
}

// java SortedArray.java