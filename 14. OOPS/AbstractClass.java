public class AbstractClass{
  public static void main(String[] args){
    Horse h = new Horse();
    h.eat();
    h.walk();
    Chicken chick = new Chicken();
    chick.eat();
    chick.walk();
  }
}
abstract class Animal{
  void eat(){
    System.out.println("animal eats");
  }
  abstract void walk();
}
class Horse extends Animal{
  void walk(){
    System.out.println("walks on 4 legs");
  }
}
class Chicken extends Animal{
  void walk(){
    System.out.println("walks on 2 legs");
  }
}
// java AbstractClass.java