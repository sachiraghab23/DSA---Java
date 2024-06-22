/*
Q1. Push at the bottom of the stack.
Q2. Reverse a string using a stack.
Q3. Reverse the given stack.
Q4. Stock span problem. Find out the maximum no. of days for which price is less than or equal to today's price.
Q5. Next greater element: The next greater element of some element x in an array is    the first greater element that is to the right of x in the same array.
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
  //Stock span
  public static void stockSpan(int stocks[],int span[]){
    Stack<Integer> s = new Stack<>();
    span[0] = 1;
    s.push(0);
    for(int i=1; i<stocks.length; i++){
      int currPrice = stocks[i];
      while(!s.isEmpty() && currPrice > stocks[s.peek()]){
        s.pop();
      }
      if(s.isEmpty()){
        span[i] = i+1;
      }
      else{
        int prevHigh = s.peek();
        span[i] = i - prevHigh;
      }
      s.push(i);
    }
  }
  //Next greater element
  public static void findNextGreaterElement(int arr[]){
    Stack<Integer> s = new Stack<>();    
    int nextGreat[] = new int[arr.length];
    for(int i = arr.length-1; i>=0; i--){
      while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
        s.pop();
      }
      if(s.isEmpty()){
        nextGreat[i] = -1;
      }else{
        nextGreat[i] = arr[s.peek()];
      }
      s.push(i);
    }
    for(int i=0; i<nextGreat.length; i++){
      System.out.print(nextGreat[i]+" ");
    }
    System.out.println();
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

    /*Q4. Stock span */
    // int stocks[] = {100,80,60,70,60,85,100};
    // int span[] = new int[stocks.length];
    // stockSpan(stocks,span);
    // for(int i=0; i<span.length; i++){
    //   System.out.println(span[i]+" ");
    // }

    /*Q5. Next greater element */
    int arr[] = {6,8,0,1,3};
    findNextGreaterElement(arr);
  }
}


// java StackProblems.java