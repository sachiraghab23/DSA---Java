public class LargestNum{
  public static void main(String[] args){
    int a = 25, b = 17, c = 32;
    int largest;
    if((a >= b) && (a >= c)) {
      largest = a;
    }
    else if(b >= c){
      largest = b;
    }
    else{
      largest = c;
    }
    System.out.println("Largest number: "+largest);    
  }
}

// java LargestNum.java