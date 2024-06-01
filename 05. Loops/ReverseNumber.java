public class ReverseNumber{
  public static void main(String[] args){
    int number = 10982;
    int revNum = 0;
    while(number > 0){
      int remain = number % 10;
      number /= 10;
      revNum = (revNum * 10) + remain;
    }
    System.out.println(revNum);
  }
}

// java ReverseNumber.java