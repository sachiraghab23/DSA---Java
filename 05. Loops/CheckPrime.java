public class CheckPrime{
  public static void main(String[] args){
    int num = 101;
    boolean isPrime = true;
    for(int i = 2; i * i <= num; i++){
      if(num % i == 0){
        isPrime = false;
        break;
      }
    }
    if(isPrime){
      System.out.println("Prime number");
    }
    else{
      System.out.println("Not a prime number");
    }
  }
}

// java CheckPrime.java