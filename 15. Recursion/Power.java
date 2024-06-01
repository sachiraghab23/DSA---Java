/*
Q. Print x^n.
*/
public class Power{
  public static int pow(int x,int n){
    if(n==0){
      return 1;
    }
    return x * pow(x,n-1);
    //time complexity: O(n)
  }
  public static int optimizedPower(int a,int n){
    if(n==0){
      return 1;
    }
    int halfPower = optimizedPower(a, n/2);
    int halfPowerSq = halfPower * halfPower;
    if(n%2 != 0){
      halfPowerSq = a * halfPowerSq;
    }
    return halfPowerSq;
    //time complexity: O(logn)
  }
  public static void main(String[] args){
    // System.out.println(pow(2,10));
    System.out.println(optimizedPower(2,10));
  }
}

// java Power.java