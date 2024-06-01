/*
Q. Find number of ways to reach from (0,0) to (N-1,M-1) in a NxM grid. Allowed moves - right and down.
*/
public class GridWays{
  public static int findGridWays(int i, int j, int n, int m){
    //base case
    if(i==n-1 && j==m-1){ //condition for last cell
      return 1;
    }else if(i == n || j==m){ //boundary cross condition
      return 0;
    }
    int w1 = findGridWays(i+1,j,n,m);
    int w2 = findGridWays(i,j+1,n,m);
    return w1 + w2;
    // Tc: O(n+m)
  }
  public static void main(String[] args){
    int n=3;
    int count = findGridWays(0,0,n,n);
    System.out.println(count);    
  }
}

// java GridWays.java