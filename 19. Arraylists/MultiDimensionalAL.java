import java.util.ArrayList;
public class MultiDimensionalAL{
  public static void main(String[] args){
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    mainList.add(list);

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(11);
    list2.add(22);
    list2.add(33);
    mainList.add(list2);

    for(int i=0; i<mainList.size(); i++){
      ArrayList<Integer> currList = mainList.get(i);
      System.out.println(currList);
    }
     System.out.println(mainList);  
  }
}

// java MultiDimensionalAL.java