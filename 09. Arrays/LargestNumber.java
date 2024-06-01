/* Find the largest number in the array */
public class LargestNumber{
  public static int findLargest(int numbers[]){
    int largest = Integer.MIN_VALUE; //-ve infinity
    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] > largest){
        largest = numbers[i];
      }
    }
    return largest;
  }
  public static void main(String[] args){
    int arr[] = {1, 2, 5, 3, 8, 4};
    System.out.println("Largest number: " + findLargest(arr));
  }
}

// java LargestNumber.java