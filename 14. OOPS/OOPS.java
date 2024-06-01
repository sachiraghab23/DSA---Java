public class OOPS{
  public static void main(String[] args){
    System.out.println("Object oriented programming");
    Pen p1 = new Pen(); //created a pen object called p1
    p1.setColor("blue");
    System.out.println(p1.color);

    BankAccount acc = new BankAccount();
    acc.username = "raghab";
    acc.setPassword("dash");
  }
}
class Pen{
  String color;
  int tip;
  void setColor(String newColor){
    color = newColor;
  }
  String getColor(){
    return this.color;
  }
  void setTip(int newTip){
    tip = newTip;
  }
}

class BankAccount{
  public String username;
  private String password;
  public void setPassword(String pass){
    password = pass;
  }

}

// java OOPS.java