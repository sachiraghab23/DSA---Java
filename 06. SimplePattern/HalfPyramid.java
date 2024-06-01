/*
Q. Print the following pattern
1
12
123
1234
*/

public class HalfPyramid{
  public static void main(String[] args){
    int n = 4;
    for(int line = 1; line <= n; line++){
      for(int star = 1; star <= line; star++){
        System.out.print(star);
      }
      System.out.println();
    }
  }
}

// java HalfPyramid.java