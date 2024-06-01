import java.util.Scanner;
public class ArrayCC{
  public static int totalSum(int marks[]){
    int sum = 0;
    for(int i = 0; i < marks.length; i++){
      sum += marks[i];
    }
    return sum;
  }
  public static void main(String[] args){
    int marks[] = new int[3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numbers");
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    System.out.println("length of array " + marks.length);
    System.out.println("sum of array numbers " + totalSum(marks));
  }
}

// java ArrayCC.java