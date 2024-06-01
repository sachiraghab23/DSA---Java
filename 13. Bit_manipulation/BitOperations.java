public class BitOperations{
  public static int getIthBit(int n, int i){
    int bitmask = 1<<i;
    if((n & bitmask) == 0){
      return 0;
    }
    else{
      return 1;
    }
  }
  public static int setIthBit(int n, int i){
    int bitmask = 1<<i;
    return n | bitmask;
  }
  public static int clearIthBit(int n, int i){
    int bitmask = ~(1<<i);
    return n & bitmask;
  }
  public static int updateIthBit(int n, int i,int bit){
    n = clearIthBit(n,i);
    int bitmask = bit<<i;
    return n | bitmask;
  }
  public static int clearLastIBits(int n, int i){
    int bitmask = (~0)<<i;
    return n & bitmask;
  }
  public static int clearRangeBits(int n, int i, int j){
    int a = ((~0)<<(j+1));
    int b = (1<<i) - 1;
    int bitmask = a | b;
    return n & bitmask;
  }
  public static int countSetBits(int n){
    //count set bits in the number
    int count = 0;
    while(n>0){
      if((n & 1) != 0){
        count++;
      }
      n = n>>1;
    }
    return count;
  }
  public static void main(String[] args){
    int num = 15; //1111
    // System.out.println(getIthBit(num,1));
    // System.out.println(setIthBit(num,2));
    // System.out.println(clearIthBit(num,1));
    // System.out.println(updateIthBit(num,1,0));
    // System.out.println(clearLastIBits(num,2)); //1100
    num = 2515; //100111010011
    // System.out.println(clearRangeBits(num,2,4)); //1100
    System.out.println(countSetBits(16)); 
  }
}

// java BitOperations.java