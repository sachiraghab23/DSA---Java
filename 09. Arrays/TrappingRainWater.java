/*
Q. Given n non-negative integers representing an elevation map where the width of each bar is 1, calculate how much water it can trap after raining.
*/

public class TrappingRainWater{
  public static int trapRainWater(int height[]){
    int n = height.length;
    //calculating left max boundary - array
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for(int i=1; i<n; i++){
      leftMax[i] = Math.max(height[i], leftMax[i-1]);
    }
    //calculating right max boundary - array
    int rightMax[] = new int[n];
    rightMax[n-1] = height[n-1];
    for(int i=n-2; i>=0; i--){
      rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }
    //loop
    int trappedWater = 0;
    for(int i=0; i<n; i++){
      //water level = min(leftmax bound, rightmax bound)
      int waterLevel = Math.min(leftMax[i], rightMax[i]);
      trappedWater += waterLevel - height[i];
    }    
    return trappedWater;
  }
  public static void main(String[] args){
    int heights[] = {4,2,0,6,3,2,5};
    System.out.println("Trapped rain water amount: "+trapRainWater(heights));
  }
}

// java TrappingRainWater.java