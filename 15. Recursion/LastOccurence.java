/*
Q. Write a function to find the last occurence of an element in an array.
*/
public class LastOccurence{
  public static int lastOcc(int arr[],int key,int i){
    //base case
    if(i == arr.length){
      return -1;
    }
    // recursion
    int isFound = lastOcc(arr,key,i+1);
    //action
    if(isFound == -1 && arr[i] == key){
      return i;
    }
    return isFound;
  }  
  public static void main(String[] args){
    int num[] = {8,3,6,9,5,10,2,5,3};
    int key = 5;
    System.out.println(lastOcc(num,key,0));
  }
}

// java LastOccurence.java