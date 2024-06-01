/*Find the index of given element in given array */
public class LinearSearch{
  public static int linearSearch(int arr[], int num){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == num){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args){
    int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
    int key = 10;
    int index = linearSearch(arr, key);
    if(index == -1){
      System.out.println("key not found");      
    }
    else{
      System.out.println("key found at index "+ index);
    }
  }
}

// java LinearSearch.java

// Time complexity: O(n)