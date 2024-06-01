public class QuickSort{
  public static void sorting(int arr[],int start,int end){
    if(start >= end){
      return;
    }
    //last element
    int pIdx = partition(arr,start,end);
    sorting(arr,start,pIdx-1); //left
    sorting(arr,pIdx+1,end); //right
    //time complexity: O(nlogn)
  }
  public static int partition(int arr[],int start, int end){
    int pivot = arr[end];
    int i = start - 1; //to make place for elements smaller than pivot
    for(int j=start; j<end; j++){
      if(arr[j]<=pivot){
        i++;
        //swap
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    i++;
    int temp = pivot;
    arr[end] = arr[i];
    arr[i] = temp;
    return i;
  }
  public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
      System.out.println();
  }
  public static void main(String[] args){
    int nums[] = {6,3,9,5,2,8};
    printArr(nums);
    sorting(nums,0,nums.length-1);
    printArr(nums);
  }
}

// java QuickSort.java