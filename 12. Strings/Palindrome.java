/*
Q. Write a function to check whether given string is palindrome or not.
*/

public class Palindrome{
  public static boolean isPalindrome(String str){
    int n = str.length();
    for(int i=0; i<n/2;i++){
      if(str.charAt(i) != str.charAt(n-i-1)){
        System.out.println("Not palindrome");
        return false;
      }
    }
    System.out.println(str+" is palindrome");
    return true;
  }
  public static void main(String[] args){
    String str = "flash";
    String str2 = "tenet";
    isPalindrome(str);
    isPalindrome(str2);
  }
}

// java Palindrome.java