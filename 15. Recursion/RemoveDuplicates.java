/*
Q. Remove duplicates in a string.
*/
public class RemoveDuplicates{
  public static void removeDup(String str, int i, StringBuilder sb,boolean map[]){
    if(i == str.length()){
      System.out.println(sb);
      return;
    }
    //action
    char currChar = str.charAt(i);
    if(map[currChar-'a'] == true){
      removeDup(str,i+1,sb,map);
    }
    else{
      map[currChar-'a'] = true;
      removeDup(str,i+1,sb.append(currChar),map);
    }
  }
  public static void main(String[] args){
    String word = "appnnacollege";
    removeDup(word,0,new StringBuilder(""),new boolean[26]);
  }
}

// java RemoveDuplicates.java