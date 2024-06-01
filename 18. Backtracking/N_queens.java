/*
Q1. Place n queens on an NxN chessboard such that no 2 queens can attack each other.
Q2. Count total number of ways in which we can solve N queens problem.
Q3. Check if problem can be solved & print only 1 solution to N queens problem.
*/
public class N_queens{
  //print all possible solutions
  public static void nQueens(char board[][], int row){
    //base case
    if(row == board.length){
      printBoard(board);
      return;
    }
    //recursion column loop
    for(int j=0; j<board.length; j++){
      if(isSafe(board,row,j)){        
        board[row][j] = 'Q';
        nQueens(board, row+1); //function call
        board[row][j] = 'x'; //backtracking step
      }
    }
    // Tc: O(n!)
  }
  //check if problem can be solved and print only one solution
  public static boolean nQueensPossible(char board[][], int row){
    //base case
    if(row == board.length){
      return true;
    }
    //recursion column loop
    for(int j=0; j<board.length; j++){
      if(isSafe(board,row,j)){        
        board[row][j] = 'Q';
        if(nQueensPossible(board, row+1)){
          return true;
        } //function call
        board[row][j] = 'x'; //backtracking step
      }
    }
    return false;
    // Tc: O(n!)
  }
  static int count = 0;
  //counts total possible ways for n queens
  public static void nQueensWays(char board[][], int row){
    //base case
    if(row == board.length){
      count++;
      return;
    }
    //recursion column loop
    for(int j=0; j<board.length; j++){
      if(isSafe(board,row,j)){        
        board[row][j] = 'Q';
        nQueensWays(board, row+1); //function call
        board[row][j] = 'x'; //backtracking step
      }
    }
    // Tc: O(n!)
  }
  public static void printBoard(char board[][]){
    System.out.println("-------chess board-------");
    for(int i=0; i<board.length; i++){
      for(int j=0; j<board.length; j++){
        System.out.print(board[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static boolean isSafe(char board[][], int row, int col){
    //vertical up
    for(int i=row-1; i>=0; i--){
      if(board[i][col] == 'Q'){
        return false;
      }
    }
    //diagonal left up
    for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
      if(board[i][j]=='Q'){
        return false;
      }
    }
    //diagonal right up
    for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
      if(board[i][j] == 'Q'){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args){
    int n=4;
    char board[][] = new char[n][n];
    //initialize
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        board[i][j] = 'x';
      }
    }
    //Q1. solution
    // nQueens(board,0);
    //Q2. solution
    // nQueensWays(board,0);
    // System.out.println("Total number of possible solutions: "+count);
    //Q3. solution
    if(nQueensPossible(board,0)){
      System.out.println("solution is possible");
      printBoard(board);
    }else{
      System.out.println("solution is not possible");
    }
  }
}

// java N_queens.java