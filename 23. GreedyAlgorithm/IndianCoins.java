/*
Q. INDIAN COINS:
  - we are given an infinite supply of denominations [1,2,5,10,20,50,100,500,2000]. Find minimum no. of coins/notes to make change for a value V.
*/
import java.util.*;
public class IndianCoins{
  public static int countCoins(int amount, ArrayList<Integer> ans){
    Integer coins[] = {1,2,5,10,20,50,100,500,2000};
    Arrays.sort(coins,Comparator.reverseOrder());
    int countOfCoins = 0;
    for(int i=0; i<coins.length; i++){
      if(coins[i] <= amount){
        while(coins[i] <= amount){
          countOfCoins++;
          ans.add(coins[i]);
          amount -= coins[i];
        }
      }
    }
    return countOfCoins;
  }
  public static void main(String[] args){
    int amount = 783;
    ArrayList<Integer> ans = new ArrayList<>();
    int count = countCoins(amount,ans);
    System.out.println("total coins = "+count);
    for(int i=0; i<ans.size(); i++){
      System.out.print(ans.get(i)+" ");
    }
    System.out.println();
  }
}

// java IndianCoins.java