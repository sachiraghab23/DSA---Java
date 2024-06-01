public class SelectionSort{
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
    for(int i=0; i<n-1; i++){
      int minPos = i;
      for(int j=i+1; j<n; j++){
        if(arr[minPos]>arr[j]){
          minPos = j;
        }
      }
      //swapping
      int temp = arr[minPos];
      arr[minPos] = arr[i];
      arr[i]=temp;
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
    for(int i=0; i<n-1; i++){
      int maxPos = i;
      for(int j=i+1; j<n; j++){
        if(arr[maxPos]<arr[j]){
          maxPos = j;
        }
      }
      //swapping
      int temp = arr[maxPos];
      arr[maxPos] = arr[i];
      arr[i]=temp;
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
    // sortingAscend(arr);
    sortingDescend(arr);
    System.out.println("After sorting,");
    printArr(arr);
  }
}

// java SelectionSort.java