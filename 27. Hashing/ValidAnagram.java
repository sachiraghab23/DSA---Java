/*
Q. Valid Anagram:
  - Given 2 strings s and t, return true, if t is an anagram of s, and false otherwise.
  - An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
*/
import java.util.*;
public class ValidAnagram{
  public static boolean isAnagram(String s, String t){
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0)+1);
    }
    for(int i=0; i<t.length(); i++){
      char ch = t.charAt(i);
      if(map.get(ch) != null){
        if(map.get(ch) == 1){
          map.remove(ch);
        }else{
          map.put(ch, map.get(ch) - 1);
        }
      }else{
        return false;
      }
    }
    return map.isEmpty();
  }
  public static void main(String[] args){
    String word1 = "race";
    String word2 = "acre";
    System.out.println(isAnagram(word1,word2));
  }
}

// java ValidAnagram.java