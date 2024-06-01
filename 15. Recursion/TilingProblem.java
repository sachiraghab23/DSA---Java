/*
Q. Tiling problem:
  Given a "2 x n" board and tiles of size "2 x 1", count the number of ways to tile the given board using the 2 x 1 tiles. 
  (A tile can either be placed horizontally or vertically.)
*/
public class TilingProblem{
  public static int tiling(int n){ //2 x n (floor size)
    //base case
    if(n == 0 || n==1){
      return 1;
    }
    //action
    //vertical choice
    int fnm1 = tiling(n-1);
    //horizontal choice
    int fnm2 = tiling(n-2);
    return fnm1 + fnm2;
  }
  public static void main(String[] args){
    System.out.println(tiling(4));
  }
}

// java TilingProblem.java