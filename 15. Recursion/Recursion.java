public class Recursion{
  //print numbers from n to 1
  public static void printDec(int n){
    //base case
    if(n == 1){
      System.out.println(n);
      return;
    }
    //action
    System.out.print(n + " ");
    //recursion
    printDec(n-1);
  }
  //print numbers from 1 to n
  public static void printInc(int n){
    //base case
    if(n == 1){
      System.out.print(n+" ");
      return;
    }
    //recursion
    printInc(n-1);
    //action
    System.out.print(n + " ");
  }
  public static void main(String[] args){
    printDec(5);
    printInc(5);
  }
}

// java Recursion.java