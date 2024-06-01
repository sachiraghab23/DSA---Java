//Write code to find area of circle

import java.util.*;
public class CircleArea{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float radius = sc.nextFloat();
    float area = 3.14f * radius *radius;
    System.out.println(area);
  }
}

//java CircleArea.java
/*
Note: When we use a decimal with a number without declaring its type, java automatically makes it double type. So, we have to use a f with the number.
*/