/*
Q. Print sum of first n natural numbers.
*/
public class NumberSum{
  public static int sum(int n){
    //base case
    if(n == 1){
      return 1;
    }
    if(n <=0){
      System.out.println("Enter positive number");
      return 0;
    }
    //action & recursion
    return n + sum(n-1);
  }  
  public static void main(String[] args){
    int n = 5;
    System.out.println(sum(n));
  }
}

// java NumberSum.java