import java.util.*;
public class LeapYear{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter year: ");
    int year = scan.nextInt();
    if(year % 4 == 0) {
      if((year % 100 == 0) && (year % 400 != 0)){
        System.out.println("Not a leap year");
      }
      else{
        System.out.println("Leap year");
      }
    }
    else{
      System.out.println("Not a leap year");
    }
  }
}

// java LeapYear.java