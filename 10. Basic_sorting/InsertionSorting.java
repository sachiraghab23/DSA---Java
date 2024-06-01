public class InsertionSorting{
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
      int curr = arr[i];
      int prev = i-1;
      while(prev >=0 && arr[prev]>curr){
        arr[prev+1] = arr[prev];
        prev--;
      }
      //insertion
      arr[prev+1]=curr;
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
      int curr = arr[i];
      int prev = i-1;
      while(prev >=0 && arr[prev]<curr){
        arr[prev+1] = arr[prev];
        prev--;
      }
      //insertion
      arr[prev+1]=curr;
    }
    //time complexity: O(n^2)
  }
  public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
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

// java InsertionSorting.java