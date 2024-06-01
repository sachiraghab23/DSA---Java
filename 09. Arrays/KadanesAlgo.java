//Q. Print the maximum sub-array sum with time complexity O(n)
public class KadanesAlgo{
  public static void kadanesAlgo(int arr[]){
    int currSum = 0, maxSum = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      currSum = currSum + arr[i];
      if(currSum < 0){
        currSum = 0;
      }
      maxSum = Math.max(currSum, maxSum);
    }
    System.out.println("Max subarray sum: "+maxSum);
    //time complexity: O(n)
  }
  public static void main(String[] args){
    int nums[] = {-2,-3,4,-1,-2,1,5,-3};
    kadanesAlgo(nums);
  }
}

// java KadanesAlgo.java