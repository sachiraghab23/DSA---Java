/*
Q. Search in Rotated Sorted Array:
  input: sorted, rotated array with distinct numbers (in ascending order). It is rotated at a pivot point. Find the index of given element.
*/
public class RotatedArray{
  public static int search(int arr[],int key,int start, int end){
    if(start>end){
      return -1;
    }
    int mid = start + (end-start)/2;
    if(arr[mid] == key){
      return mid;
    }
    //mid on Line 1
    if(arr[start]<=arr[mid]){
      //case 1: left
      if(arr[start]<=key && key <=arr[mid]){
        return search(arr,key,start,mid-1);
      }
      else{
        //case 2: right
        return search(arr,key,mid+1,end);
      }
    }
    //mid on Line 2
    else{
      // case 3: right
      if(arr[mid]<=key && key<=arr[end]){
        return search(arr,key,mid+1,end);
      }
      //case 4: left
      else{
        return search(arr,key,start,mid-1);
      }
    }
  }
  public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
      System.out.println();
  }
  public static void main(String[] args){
    int nums[] = {4,5,6,7,0,1,2};
    int target = 0;
    System.out.println(search(nums,target,0,nums.length-1));
  }
}

// java RotatedArray.java