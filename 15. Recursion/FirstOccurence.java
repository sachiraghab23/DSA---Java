/*
Q. Write a function to find the first occurence of an element in an array.
*/
public class FirstOccurence{
  public static int firstOcc(int arr[],int key,int i){
    //base case
    if(i == arr.length){
      return -1;
    }
    //action
    if(arr[i] == key){
      return i;
    }
    // recursion
    return firstOcc(arr,key,i+1);
  }  
  public static void main(String[] args){
    int num[] = {8,3,6,9,5,10,2,5,3};
    int key = 5;
    System.out.println(firstOcc(num,key,0));
  }
}

// java FirstOccurence.java