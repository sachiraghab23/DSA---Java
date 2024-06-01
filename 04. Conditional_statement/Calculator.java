import java.util.*;
public class Calculator{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = scan.nextInt();
    System.out.print("Enter second number: ");
    int b = scan.nextInt();
    System.out.print("operator: ");
    char operator = scan.next().charAt(0);
    int result;
    switch (operator){
      case '+' : result = a + b; break;
      case '-' : result = a - b; break;
      case '*' : result = a * b; break;
      case '/' : result = a / b; break;
      case '%' : result = a % b; break;
      default: result = 0;
    }
    
    System.out.println("result: "+result);
  }
}

// java Calculator.java