/*
Q1. Push at the bottom of the stack.
Q2. Reverse a string using a stack.
Q3. Reverse the given stack.
*/

import java.util.Stack;
public class StackProblems{
  //push at bottom
  public static void pushAtBottom(Stack<Integer> s, int data){
    if(s.isEmpty()){
      s.push(data);
      return;
    }
    int top = s.pop();
    pushAtBottom(s,data);
    s.push(top);
  }
  //reverse the given string
  public static String reverse(String str){
    Stack<Character> s = new Stack<>();
    int idx = 0;
    while(idx<str.length()){
      s.push(str.charAt(idx));
      idx++;
    }
    StringBuilder result = new StringBuilder("");
    while(!s.isEmpty()){
      char curr = s.pop();
      result.append(curr);
    }
    return result.toString();
  }
  //reverse given stack
  public static void reverseStack(Stack<Integer> stack){
    if(stack.isEmpty()){
      return;
    }
    int top = stack.pop();
    reverseStack(stack);
    pushAtBottom(stack,top);
  }
  public static void printStack(Stack<Integer> s){
    while(!s.isEmpty()){
      System.out.println(s.pop());
    }
  }
  public static void main(String[] args){
    /*Q1. push at bottom */
    // Stack<Integer> st = new Stack<>();
    // st.push(1);
    // st.push(2);
    // st.push(3);
    // pushAtBottom(st,4);
    // while(!st.isEmpty()){
    //   System.out.println(st.pop());

    /*Q2. reverse string */
    // String str = "hulk smash";
    // String result = reverse(str);
    // System.out.println(result);

    /*Q3. reverse stack*/
    // Stack<Integer> s = new Stack<>();
    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // reverseStack(s);
    // printStack(s);
  }
}


// java StackProblems.java