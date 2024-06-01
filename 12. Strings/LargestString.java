/*
Q. For a given set of strings, print the largest string.
(Hint: Arrange strings in lexicographic order (alphabetically))
*/
public class LargestString{
  public static String findLargest(String str[]){
    String largest = str[0];
    for(int i=1; i<str.length; i++){
      if(largest.compareTo(str[i])<0){
        largest = str[i];
      }
    }
    return largest;
  }
  public static void main(String[] args){
    String fruits[] = {"apple","mango","banana","pineapple","kiwi","grapes"};
    String largestStr = findLargest(fruits);
    System.out.println(largestStr);
  }
}

// java LargestString.java