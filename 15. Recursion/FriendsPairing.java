/*
Q. Friends Pairing problem:
  Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.
*/
public class FriendsPairing{
  public static int pairing(int n){
    if(n == 1 || n==2){
      return n;
    }
    //choices
    //single choice
    int fnm1 = pairing(n-1);
    //pair choice
    int fnm2 = pairing(n-2);
    int pairWays = (n-1) * fnm2;
    return fnm1 + pairWays;
  }
  public static void main(String[] args){
    System.out.println(pairing(3));
  }
}

// java FriendsPairing.java