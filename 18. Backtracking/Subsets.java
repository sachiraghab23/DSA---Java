/*
Q. Find & print all subsets of a given string.
input: "abc"
output: a, b, c, ab, bc, ac, abc, ""
*/
public class Subsets{
  public static void findSubsets(String str, String ans, int i){
    //base case
    if(i==str.length()){
      if(ans.length()==0){
        System.out.println("null");
      }else{
        System.out.println(ans);
      }
      return;
    }
    //recursion
    //Yes choice
    findSubsets(str, ans+str.charAt(i),i+1);
    //No choice
    findSubsets(str, ans,i+1);
    //TC: O(2^n)
  }
  public static void main(String[] args){
    String str = "abc";
    findSubsets(str, "", 0);
  }
}

// java Subsets.java