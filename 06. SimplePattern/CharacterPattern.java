/*
Q. Print the following pattern
A
BC
DEF
GHIJ
*/

public class CharacterPattern{
  public static void main(String[] args){
    int n = 4;
    char ch = 'A';
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= i; j++){    
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }
}

// java CharacterPattern.java