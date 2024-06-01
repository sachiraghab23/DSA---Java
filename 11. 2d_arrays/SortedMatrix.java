/*
Q. Write a function to search for a key in row wise & column wise in sorted matrix.
*/

public class SortedMatrix{
  public static void stairCaseSearch(int arr[][],int key){
    //optimized approach
    int row=0, col=arr[0].length-1;
    while(row<arr.length && col >=0){
      if(arr[row][col] == key){
        System.out.println(key+" found at (" +row+","+col+")");
        return;
      }
      else if(key < arr[row][col]){
        col--;
      }
      else{
        row++;
      }
    }
    System.out.println("Not found");
  }
  public static void main(String[] args){
    int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
    int key = 25;
    stairCaseSearch(matrix,key);
  }
}

// java SortedMatrix.java
//time complexity: O(m+n)