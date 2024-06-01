public class FunctionOverloading{
  public static int sum(int a, int b, int c){
    return a + b + c;
  }
  public static float sum(int a, float b){
    return a + b;
  }
  public static int sum(int a, int b){
    return a + b;
  }
  public static void main(String[] args){
    int sum1 = sum(3, 8, 9);
    int sum2 = sum(3, 8);
    float sum3 = sum(5, 4.2f);
    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);
  }
}

// java FunctionOverloading.java