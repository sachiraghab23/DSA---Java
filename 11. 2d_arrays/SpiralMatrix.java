/*
Q. print a function to print matrix elements in a spiral way.
*/

public class SpiralMatrix{
  public static void printSpiral(int arr[][]){
    int startRow = 0, startCol = 0;
    int endRow = arr.length - 1, endCol = arr[0].length-1;
    while(startRow<=endRow && startCol<=endCol){
      //top
      for(int c=startCol; c<=endCol; c++){
        System.out.print(arr[startRow][c]+" ");
      }
      //right
      for(int r=startRow+1; r<=endRow; r++){
        System.out.print(arr[r][endCol]+" ");
      }
      //bottom
      for(int c=endCol-1; c>=startCol; c--){
        if(startRow == endRow){
          break;
        }
        System.out.print(arr[endRow][c]+" ");
      }
      //left
      for(int r=endRow-1; r>=startRow+1; r--){
        if(startCol == endCol){
          break;
        }
        System.out.print(arr[r][startCol]+" ");
      }
      startCol++;
      startRow++;
      endRow--;
      endCol--;
    }
  }
  public static void main(String[] args){
    int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    printSpiral(matrix);
  }
}

// java SpiralMatrix.java