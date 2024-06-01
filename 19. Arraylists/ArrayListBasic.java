import java.util.ArrayList;
public class ArrayListBasic{
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    //add
    list.add(1);
    list.add(2);
    list.add(3);

    //print
    System.out.println(list);

    //get
    int ele = list.get(0);
    System.out.println(ele);

    //delete
    list.remove(2);
    System.out.println(list);

    //set
    list.set(1,10);
    list.add(2,15);
    System.out.println(list);

    //contains
    System.out.println(list.contains(1));
    System.out.println(list.contains(12));
    System.out.println(list.size());
  }
}

//java ArrayListBasic.java