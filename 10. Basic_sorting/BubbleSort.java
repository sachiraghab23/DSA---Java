public class BubbleSort{
  public static void sortingAscend(int arr[]){
    int n = arr.length;
    boolean isSorted = true;
    for(int i=1; i<n; i++){
      if(arr[i-1]>arr[i]){
        isSorted = false;
        break;
      }
    }
    if(isSorted){
      System.out.println("The array is sorted");
      return;
    }
    for(int i=0; i<n; i++){
      for(int j=0; j<n-1-i; j++){
        if(arr[j]>arr[j+1]){
          //swapping
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    //time complexity: O(n^2)
  }
  public static void sortingDescend(int arr[]){
    int n = arr.length;
    boolean isSorted = true;
    for(int i=1; i<n; i++){
      if(arr[i-1]<arr[i]){
        isSorted = false;
        break;
      }
    }
    if(isSorted){
      System.out.println("The array is sorted");
      return;
    }
    for(int i=0; i<n; i++){
      for(int j=0; j<n-1-i; j++){
        if(arr[j]<arr[j+1]){
          //swapping
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    //time complexity: O(n^2)
  }
  public static void printArr(int arr[]){
    int n = arr.length;
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args){
    int arr[] = {5,4,1,3,2};
    System.out.println("Before sorting,");
    printArr(arr);
    sortingAscend(arr);
    // sortingDescend(arr);
    System.out.println("After sorting,");
    printArr(arr);
  }
}

// java BubbleSort.java