/*
Sorted & rotated pair sum:
- Find if any pair in a sorted and rotated arraylist has a target sum.
*/
import java.util.ArrayList;
public class SortedRotatedPairSum{
  //2 pointer approach
  public static boolean pairSum(ArrayList<Integer> list, int target){
    int breakPoint = -1;
    int n = list.size();
    for(int i=0; i<n; i++){
      if(list.get(i) > list.get(i+1)){
        //breaking point
        breakPoint = i;
        break;
      }
    }
    int lp = breakPoint + 1; //smallest
    int rp = breakPoint; //largest
    while(lp != rp){
      //case 1
      if(list.get(lp) + list.get(rp) == target){
        return true;
      }
      //case 2
      else if(list.get(lp) + list.get(rp) < target){
        lp = (lp + 1) % n;
      }
      //case 3
      else{
        rp = (n + rp - 1) % n;
      }
    }
    return false;
  }
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int target = 16;
    System.out.println(pairSum(list,target));
  }
}

// java SortedRotatedPairSum.java