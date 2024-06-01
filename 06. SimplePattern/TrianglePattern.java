/*
Q. Print the following pattern
*
**
***
****
*/

public class TrianglePattern{
  public static void main(String[] args){
    int n = 4;
    for(int line = 0; line < n; line++){
      for(int star = 0; star <= line; star++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

// java TrianglePattern.java

/* Nested loop means loops inside loop*/