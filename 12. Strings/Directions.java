/*
Q. Given a route containing 4 directions (E,W,N,S), find the shortest path to reach destination.
*/

public class Directions{
  public static float getShortestPath(String path){
    int x=0, y=0;
    for(int i=0; i<path.length();i++){
      char dir = path.charAt(i);
      switch(dir){
      //south
        case 'S': y--; break;
        case 'N': y++; break;
        case 'W': x--; break;
        case 'E': x++; break;
        default: break;
      }
    }
    int X2 = x*x;
    int Y2 = y*y;
    return (float)Math.sqrt(X2 + Y2);
  }
  public static void main(String[] args){
    String path = "WNEENESENNN";
    System.out.println(getShortestPath(path));
  }
}

// java Directions.java