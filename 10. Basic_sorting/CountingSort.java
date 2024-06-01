public class CountingSort{
  public static void sortAscend(int arr[]){
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
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<n; i++){
      largest = Math.max(largest,arr[i]);
    }
    int count[] = new int[largest+1];
    //updating count elements
    for(int i=0; i<n; i++){
      count[arr[i]]++;
    }
    //sorting
    int j=0;
    for(int i=0; i<count.length; i++){
      while(count[i]>0){
        arr[j] = i;
        j++;
        count[i]--;
      }
    }
  }
  public static void sortDescend(int arr[]){
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
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<n; i++){
      largest = Math.max(largest,arr[i]);
    }
    int count[] = new int[largest+1];
    //updating count elements
    for(int i=0; i<n; i++){
      count[arr[i]]++;
    }
    //sorting
    int j=0;
    for(int i=count.length-1; i>=0; i--){
      while(count[i]>0){
        arr[j] = i;
        j++;
        count[i]--;
      }
    }
  }
  public static void printArr(int arr[]){
    int n = arr.length;
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args){
    int nums[] = {1,4,1,3,2,4,3,7};
    System.out.println("Before sorting,");
    printArr(nums);
    // sortAscend(nums);
    sortDescend(nums);
    System.out.println("After sorting,");
    printArr(nums);
  }
}

// java CountingSort.java