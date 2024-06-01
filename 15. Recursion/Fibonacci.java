/*
Q. Print nth fibonacci number.
*/
public class Fibonacci{
  public static int fib(int n){
    //base case
    if(n == 1 || n == 0){
      return n;
    }
    //action & recursion
    return fib(n-2) + fib(n-1);
  }  
  public static void main(String[] args){
    int n = 5;
    System.out.println(fib(n));
  }
}

// java Fibonacci.java