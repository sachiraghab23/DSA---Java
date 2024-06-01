/*
Q. Check if a number is odd or even.
*/

public class EvenOdd{
  public static void isEvenOrOdd(int n){
    int bitMask = 1;
    if((n & bitMask) == 0){
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }
  }
  public static void main(String[] args){
    int num = 83;
    isEvenOrOdd(num);
  }
}

// java EvenOdd.java