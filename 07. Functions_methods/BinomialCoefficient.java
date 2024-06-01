public class BinomialCoefficient{
  public static int factorial(int num){
    int fact = 1;
    for (int i = 1; i <= num; i++){
      fact *= i;
    }
    return fact;
  }
  public static int binCof(int n, int r){
    int n_fact = factorial(n);
    int r_fact = factorial(r);
    int nmr_fact = factorial(n - r);
    return n_fact/(r_fact * nmr_fact);
  }
  public static void main(String[] args){
    int result = binCof(5, 2); 
    System.out.println(result);
  }
}

// java BinomialCoefficient.java