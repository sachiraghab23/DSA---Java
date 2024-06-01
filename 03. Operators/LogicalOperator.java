public class LogicalOperator{
  public static void main(String[] args){    
    
    System.out.println("AND operator:");
    System.out.println("true && true: "+(true && true));
    System.out.println("true && false: "+(true && false));
    System.out.println("false && true: "+(false && true));
    System.out.println("false && false: "+(false && false));

    System.out.println("OR operator:");
    System.out.println("true || true: "+(true || true));
    System.out.println("true || false: "+(true || false));
    System.out.println("false || true: "+(false || true));
    System.out.println("false || false: "+(false || false));

    System.out.println("NOT operator:");
    System.out.println("!true: "+(!true));
    System.out.println("!false: "+(!false));
  }
}

// java LogicalOperator.java