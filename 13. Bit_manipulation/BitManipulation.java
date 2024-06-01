public class BitManipulation{
  public static void main(String[] args){
    System.out.println("Binary AND");
    System.out.println("0 & 0: "+(0 & 0));
    System.out.println("0 & 1: "+(0 & 1));
    System.out.println("1 & 0: "+(1 & 0));
    System.out.println("1 & 1: "+(1 & 1));

    System.out.println("Binary OR");
    System.out.println("0 | 0: "+(0 | 0));
    System.out.println("0 | 1: "+(0 | 1));
    System.out.println("1 | 0: "+(1 | 0));
    System.out.println("1 | 1: "+(1 | 1));

    System.out.println("Binary XOR");
    System.out.println("0 ^ 0: "+(0 ^ 0));
    System.out.println("0 ^ 1: "+(0 ^ 1));
    System.out.println("1 ^ 0: "+(1 ^ 0));
    System.out.println("1 ^ 1: "+(1 ^ 1));

    System.out.println("Binary One's complement");
    System.out.println("~1: "+(~1));
    System.out.println("~0: "+(~0));
    
    System.out.println("Binary Left shift operator");
    System.out.println("50 << 2: "+(50 << 2));

    System.out.println("Binary Right shift operator");
    System.out.println("50 >> 2: "+(50 >> 2));
  }
}

// java BitManipulation.java