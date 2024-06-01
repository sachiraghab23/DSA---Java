public class BreakStatement{
  public static void main(String[] args){
    int n = 0;
    while(n < 15){
      if(n == 10){
        break;
      }
      System.out.println(n);
      n++;
    }
  }
}

// java BreakStatement.java