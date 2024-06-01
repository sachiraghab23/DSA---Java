public class MethodOverriding{
  public static void main(String[] args){
    Deer dr = new Deer();
    dr.eat();
    Animal aml = new Animal();
    aml.eat();
  }
}
class Animal{
  void eat(){
    System.out.println("eats anything");
  }
}
class Deer extends Animal{
  void eat(){
    System.out.println("eats grass");
  }
}
// java MethodOverriding.java