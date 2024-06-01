/*
Q. print a function to find sum of diagonal matrix elements in a spiral way.
*/

public class DiagonalSum{
  public static int diagSum(int arr[][]){
    int sum = 0;
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        //primary diagonal
        if(i==j){
          sum += arr[i][j];
        }
        //secondary diagonal
        else if(i + j == arr.length - 1){
          sum += arr[i][j];
        }
      }
    }
    return sum;
    //time complexity: O(n^2)
  }
  public static int diagSum2(int arr[][]){
    int sum = 0;
    for(int i=0; i<arr.length; i++){
      //primary diagonal
      sum += arr[i][i];
      if(i != arr.length - i - 1){
        //secondary diagonal
        sum += arr[i][arr.length-i-1];
      }
    }
    return sum;
    //time complexity: O(n)
  }
  public static void main(String[] args){
    int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    // int diagonalSum = diagSum(matrix);
    int diagonalSum = diagSum2(matrix);
    System.out.println("Diagonal sum: "+diagonalSum);
  }
}

// java DiagonalSum.java