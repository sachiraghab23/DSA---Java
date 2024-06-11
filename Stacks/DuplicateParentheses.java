/*
Valid Parentheses:
  - Given a balanced expression, find if it contains duplicate parentheses or not. A set of parentheses are duplicate if the same subexpression is surrounded by multiple parentheses.
  - Return a true if it contains duplicates else return false.
*/
import java.util.*;
public class DuplicateParentheses{
  public static boolean isDuplicate(String str){
    Stack<Character> s = new Stack<>();
    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      //closing
      if(ch == ')'){
        int count = 0;
        while(s.peek() != '('){
          s.pop();
          count++;
        }
        if(count<1){
          return true; //duplicate
        }else{
          s.pop(); //opening pair
        }
      }else{
        //opening
        s.push(ch);
      }
    }
    return false;
  }
  public static void main(String[] args){
    String str1 = "(((a+(b)))+(c+d))";
    String str2 = "((((a)+(b))+c+d))";
    String str3 = "((a+b)+(c+d))";
    String str4 = "(((a+b))+c)";
    String str5 = "(a-b)";
    System.out.println(isDuplicate(str1));
    System.out.println(isDuplicate(str5));
  }
}

//java DuplicateParentheses.java