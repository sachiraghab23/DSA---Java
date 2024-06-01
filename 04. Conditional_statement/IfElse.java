import java.util.*;
public class IfElse{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    if(age >= 18){
      System.out.println("adult : drive, vote");
    }else if(age > 13){
      System.out.println("teenager");
    }else{
      System.out.println("not an adult");
    }
  }
}

// java IfElse.java