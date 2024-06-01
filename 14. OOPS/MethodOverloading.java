public class MethodOverloading{
  public static void main(String[] args){
    Calculator calc = new Calculator();
    System.out.println(calc.sum(3,8));
    System.out.println(calc.sum(3.2f,8.7f));
    System.out.println(calc.sum(3,8,2));
  }
}
class Calculator{
  int sum(int a, int b){
    return a+b;
  }
  float sum(float a,float b){
    return a+b;
  }
  int sum(int a, int b, int c){
    return a+b+c;
  }
}
// java MethodOverloading.java