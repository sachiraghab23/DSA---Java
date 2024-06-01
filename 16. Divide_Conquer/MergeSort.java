public class MergeSort{
  public static void sorting(int arr[],int start,int end){
    if(start >= end){
      return;
    }
    int mid = start + (end - start)/2;
    sorting(arr,start,mid);
    sorting(arr,mid+1,end);
    merge(arr,start,mid,end);
    //time complexity: O(nlogn)
    //space complexity: O(n)
  }
  public static void merge(int arr[],int start,int mid, int end){
    int temp[] = new int[end - start + 1];
    int i = start;
    int j = mid + 1;
    int k = 0;
    while(i <= mid && j <= end){
      if(arr[i]<arr[j]){
        temp[k] = arr[i];
        i++;
      }
      else{
        temp[k] = arr[j];
        j++;
      }
      k++;
    }
    //left part
    while(i <= mid){
      temp[k++] = arr[i++];
    }
    //right part
    while(j <= end){
      temp[k++] = arr[j++];
    }
    //copy temp to original arr
    for(k=0, i=start; k<temp.length; k++, i++){
      arr[i] = temp[k];
    }
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

// java MergeSort.java