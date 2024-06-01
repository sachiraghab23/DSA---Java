public class SwapValue{
  public static void swap(int a, int b){
    int temp = a;
    a = b;
    b = temp;
    System.out.println("During swapping");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
  public static void main(String[] args){
    int a = 5, b = 8;
    System.out.println("Before swapping");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    swap(a, b); //call by value
    System.out.println("After swapping");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}

// java SwapValue.java