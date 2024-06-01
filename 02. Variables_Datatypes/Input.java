/*
Inputs for different data types:
next
nextLine
nextInt
nextByte
nextFloat
nextDouble
nextBoolean
nextShort
nextLong
*/

import java.util.Scanner;
public class Input{
  public static void main(String[] args){
    System.out.println("Receiving inputs for different data types");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    System.out.println(number);
    String name = sc.next();
    System.out.println(name);
    float pi = sc.nextFloat();
    System.out.println(pi);
  }
}

// java Input.java