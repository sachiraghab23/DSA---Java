public class PrimeNumbers{
  public static boolean isPrime(int num){
    if(num == 2){
      return true;
    }
    for (int i = 2; i * i <= num; i++){
      if(num % i == 0){
        return false;
      }
    }
    return true;
  }
  public static void printPrimeNumbers(int num){
    for (int i = 2; i <= num; i++){
      if(isPrime(i)){
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
  public static void main(String[] args){
    printPrimeNumbers(100);
  }
}

// java PrimeNumbers.java