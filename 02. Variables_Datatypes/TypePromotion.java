public class TypePromotion{
  public static void main(String[] args){    
    char a = 'a';
    char b = 'b';
    byte bt = 5;
    int num = bt * 5;
    
    bt = (byte)(bt - 2);
    System.out.println(b-a);
    System.out.println(num);
    System.out.println(bt);
  }
}

// java TypePromotion.java