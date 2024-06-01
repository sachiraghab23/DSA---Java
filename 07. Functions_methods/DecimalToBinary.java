public class DecimalToBinary{
  public static int decToBin(int decNum){    
    int pow = 0;
    int binNum = 0;
    while(decNum > 0){
      int remain = decNum % 2;
      binNum += (remain * (int)Math.pow(10, pow));
      pow++;
      decNum = decNum/2;
    }
    return binNum;
  }
  public static void main(String[] args){
    int binary = decToBin(13);
    System.out.println(binary);
  }
}

// java DecimalToBinary.java