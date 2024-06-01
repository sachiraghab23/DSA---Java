public class Constructor{
  public static void main(String[] args){
    Student ram = new Student();
    Student rohan = new Student("rohan");
    Student sonam = new Student(rohan);
    sonam.printDetails();
  }
}
class Student{
  String name;
  int roll;
  String username;
  //Non-parameterized constructor
  Student(){
    name = "raghab";
    roll = 30;
    System.out.println("constructor is called...");
  }
  //Parameterized constructor
  Student(String name){
    this.name = name;
    System.out.println("constructor is called...");
  }
  //copy constructor
  Student(Student s1){
    this.name = s1.name;
    this.roll = s1.roll;
  }
  void printDetails(){
    System.out.println(this.name);
    System.out.println(this.roll);
  }
}
// java Constructor.java