/*
Q. Print factorial of a number n.
*/
public class Factorial{
  public static int fact(int n){
    //base case
    if(n <= 0){
      return 1;
    }
    //action & recursion
    return n * fact(n-1);
  }
  
  public static void main(String[] args){
    int n = 5;
    System.out.println(fact(n));
  }
}

// java Factorial.java