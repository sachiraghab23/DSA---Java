import java.util.*;
public class TaxCalculator{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your income: ");
    int income = scan.nextInt();
    int tax;
    if(income < 500000) {
      tax = 0;
    }
    else if(income >= 500000 && income < 1000000) {
      tax = (int) (income * 0.2);
    }
    else {
      tax = (int) (income * 0.3);
    }
    System.out.println("Your tax amount: "+tax);
  }
}

// java TaxCalculator.java