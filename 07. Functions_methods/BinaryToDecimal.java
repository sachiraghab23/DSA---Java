public class BinaryToDecimal{
  public static int binToDec(int binNum){
    int pow = 0;
    int decNum = 0;
    while(binNum > 0){
      int lastDigit = binNum % 10;
      decNum += (lastDigit * (int)Math.pow(2,pow));
      pow++;
      binNum = binNum/10;
    }
    return decNum;
  }
  public static void main(String[] args){
    int decimal = binToDec(111);
    System.out.println(decimal);
  }
}

// java BinaryToDecimal.java