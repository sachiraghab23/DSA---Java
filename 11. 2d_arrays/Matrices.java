public class Matrices{
  public static void search(int arr[][], int n){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        if(arr[i][j]==n){
          System.out.println(n + " found at index ("+i+","+j+")");
          return;
        }
      }
    }
    System.out.println(n+" is not found");
  }
  public static void printMatrix(int matrix[][]){
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[i].length; j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    search(matrix,10);
  }
}

// java Matrices.java