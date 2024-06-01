/*Find the index of given element in given array */
public class BinarySearch{
  public static int binarySearch(int arr[], int num){
    int start = 0, end = arr.length - 1;
    while(start <= end){
      int mid = (start + end)/2;
      if(arr[mid] == num){
        return mid;
      }
      else if(arr[mid] > num){ //left
        end = mid - 1;
      }
      else{ //right
        start = mid + 1;
      }
    }
    return -1;
  }
  public static void main(String[] args){
    int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
    int key = 10;
    int index = binarySearch(arr, key);
    if(index == -1){
      System.out.println("key not found");      
    }
    else{
      System.out.println("key found at index "+ index);
    }
  }
}

// java BinarySearch.java

// Time complexity: O(logn)