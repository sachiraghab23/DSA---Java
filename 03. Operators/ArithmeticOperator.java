public class ArithmeticOperator{
  public static void main(String[] args){
    System.out.println("Binary operators");
    int a = 15, b = 8;
    int add = a + b;
    int sub = a - b;
    int product = a * b;
    int div = a/b;
    int mod = a%b;
    System.out.println("addition: "+add);
    System.out.println("subtraction: "+sub);
    System.out.println("product: "+product);
    System.out.println("division: "+div);
    System.out.println("modulus: "+mod);
    System.out.println();
    System.out.println("Unary operators");

    int num = 10;
    System.out.println("pre-increment: "+(++num));
    System.out.println(num);
    System.out.println("post-increment: "+(num++));
    System.out.println(num);
    System.out.println("pre-decrement: "+(--num));
    System.out.println(num);
    System.out.println("post-decrement: "+(num--));
    System.out.println(num);


  }
}

// java ArithmeticOperator.java