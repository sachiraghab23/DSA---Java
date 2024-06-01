public class MaxSubarray{
  public static void maxSubarraySum(int arr[]){
    int currSum = 0, maxSum = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      int start = i;
      for(int j=i; j<arr.length; j++){
        int end = j;
        currSum = 0;
        for(int k = start; k<=end; k++){
          currSum += arr[k];
        }
        System.out.println(currSum);
        if(currSum > maxSum){
          maxSum = currSum;
        }
      }
    }
    System.out.println("Max sub-array sum: " + maxSum);
    //time complexity: O(n^3)
  }
  public static void maxSubarraySum2(int arr[]){
    //prefix based approach
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];
    prefix[0] = arr[0];
    for(int i=1; i<arr.length; i++){
      prefix[i] = prefix[i-1] + arr[i];
    }
    for(int i=0; i<arr.length; i++){ //-2,-3,4,-1,-2,1,5,-3
      int si = i;
      for(int j=i; j<arr.length; j++){
        int ei = j;
        int currSum = (si == 0) ? prefix[ei] : prefix[ei] - prefix[si-1];
        if(currSum > maxSum){
          maxSum = currSum;
        }
      }
    }
    System.out.println("Max sub-array sum: " + maxSum);
    //time complexity: O(n^2)
  }
  public static void main(String[] args){
    int nums[] = {-2,-3,4,-1,-2,1,5,-3};
    // maxSubarraySum(nums);
    maxSubarraySum2(nums);
  }
}

// java MaxSubarray.java