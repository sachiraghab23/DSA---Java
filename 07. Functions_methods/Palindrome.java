public class Palindrome{
  public static boolean checkPalindrome(int num){
    int palindrome = num;
    int reverse = 0;
    while(palindrome > 0){
      int remain = palindrome % 10;
      reverse = reverse * 10 + remain;
      palindrome = palindrome / 10;
    }
    return palindrome == reverse;
  }
  public static void main(String[] args){
    int n = 105;
    boolean isPalindrome = checkPalindrome(n);
    if(isPalindrome){
      System.out.println("Palindrome");
    }else{
      System.out.println("Not palindrome");
    }
  }
}

// java Palindrome.java