public class AssignmentOperator{
  public static void main(String[] args){    
    int a = 8, b = 3;
    
    System.out.println(a+" += "+ b+" : "+(a += b));
    System.out.println(a+" -= "+ b+" : "+(a -= b));
    System.out.println(a+" *= "+ b+" : "+(a *= b));
    System.out.println(a+" /= "+ b+" : "+(a /= b));
    System.out.println(a+" %= "+ b+" : "+(a %= b));
  }
}

// java AssignmentOperator.java