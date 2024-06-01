public class StringClass{
  public static void main(String[] args){
    String str = "Reverse flash";
    System.out.println("length: "+str.length());
    //concatenation
    String firstName = "Stephen";
    String lastName = "Strange";
    String fullName = firstName +" "+lastName;
    System.out.println(fullName);
    printLetters(fullName);
  }
  public static void printLetters(String str){
    for(int i=0; i<str.length();i++){
      System.out.print(str.charAt(i)+" ");
    }
      System.out.println();
  }
}

// java StringMethods.java