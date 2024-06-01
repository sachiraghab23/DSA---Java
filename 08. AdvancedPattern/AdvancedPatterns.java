public class AdvancedPatterns{
  public static void hollowRectangle(int n, int m){
    for(int i = 0; i < m; i++){
      for(int j = 0; j < n; j++){
        if(i == 0 || j == 0 || i == (m - 1) || j == (n-1)){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  public static void inverted_half_pyramid_withNum(int n){
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= (n - i + 1); j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
  public static void inverted_rotated_half_pyramid(int n){
    for(int i = 1; i <= n; i++){
      //spaces
      for(int s = 1; s <= n - i; s++){
        System.out.print(" ");
      }
      //stars
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void floyds_triangle(int n){
    int count = 1;
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= i; j++){
        System.out.print(count++ + " ");
      }
      System.out.println();
    }
  }
  public static void zero_one(int n){    
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= i; j++){
        if((i + j) % 2 == 0){
          System.out.print("1 ");          
        }else{
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
  }
  public static void butterfly(int n){
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      for(int s = 1; s <= 2 * (n - i); s++){
        System.out.print(" ");
      }
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i = n; i >= 1; i--){
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      for(int s = 1; s <= 2 * (n - i); s++){
        System.out.print(" ");
      }
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void solid_rhombus(int n){
    for(int i = 1; i <= n; i++){
      for(int s = 1; s <= (n - i); s++){
        System.out.print(" ");
      }
      for(int j = 1; j <= n; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void hollow_rhombus(int n){
    for(int i = 1; i <= n; i++){
      for(int s = 1; s <= (n - i); s++){
        System.out.print(" ");
      }
      for(int j = 1; j <= n; j++){
        if(j == 1 || j == n || i == 1 || i == n){
          System.out.print("*");
        }          
        else{
          System.out.print(" ");
        }          
      }
      System.out.println();
    }
  }
  public static void diamond(int n){
    //first half
    for(int i = 1; i <= n; i++){
      //spaces
      for(int s = 1; s <= (n - i); s++){
        System.out.print(" ");
      }
      for(int j = 1; j <= (2 * i - 1); j++){
        System.out.print("*");
      }
      System.out.println();
    }
    //second half
    for(int i = n; i >= 1; i--){
      //spaces
      for(int s = 1; s <= (n - i); s++){
        System.out.print(" ");
      }
      for(int j = 1; j <= (2 * i - 1); j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    int row = 4;
    int col = 5;
    // hollowRectangle(row, col);
    // inverted_half_pyramid_withNum(row);
    // inverted_rotated_half_pyramid(row);
    // floyds_triangle(row);
    // zero_one(row);
    // butterfly(row);
    // solid_rhombus(row);
    // hollow_rhombus(row);
    diamond(row);
  }
}

// java AdvancedPatterns.java