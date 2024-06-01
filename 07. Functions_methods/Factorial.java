public class Factorial{
  public static int factorial(int num){
    int fact = 1;
    for (int i = 1; i <= num; i++){
      fact *= i;
    }
    return fact;
  }
  public static void main(String[] args){
    int result = factorial(5); 
    System.out.println(result);
  }
}

// java Factorial.java