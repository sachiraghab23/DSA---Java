/* Reverse the given array */
public class ReverseArray{
  public static void reverse(int arr[]){
    int first = 0, last = arr.length - 1;
    while(first < last){
      int temp = arr[first];
      arr[first] = arr[last];
      arr[last] = temp;
      first++;
      last--;
    }
  }
  public static void printArr(int arr[]){
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args){
    int arr[] = {1, 2, 3, 4, 5, 6};
    System.out.println("Before reversing array");
    printArr(arr);
    reverse(arr);
    System.out.println("After reversing array");
    printArr(arr);
  }
}

// java ReverseArray.java