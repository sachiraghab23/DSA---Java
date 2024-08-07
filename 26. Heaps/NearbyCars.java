/*
Q. Nearby Cars:
  - we are given N points in a 2d plane which are locations of N cars. If we are at the origin, print the nearest K cars.
*/
import java.util.Comparator;
import java.util.PriorityQueue;
public class NearbyCars{
  static class Point implements Comparable<Point>{
    int x,y, distSq;
    int idx;
    public Point(int x, int y, int dist, int idx){
      this.x = x;
      this.y = y;
      this.distSq = dist;
      this.idx = idx;
    }
    @Override
    public int compareTo(Point p2){
      return this.distSq - p2.distSq; //ascending order
    }
  }
  public static void main(String[] args){
    int pts[][] = {{3,3},{5,-1},{-2,4}};
    int k = 2;
    PriorityQueue<Point> pq = new PriorityQueue<>();
    for(int i=0; i<pts.length; i++){
      int distSq = pts[i][0]*pts[i][0] + pts[i][1] * pts[i][1];
      pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
    }
    //nearest K cars
    for(int i=0; i<k; i++){
      System.out.println("C"+pq.remove().idx);
    }
  }
}

// java NearbyCars.java