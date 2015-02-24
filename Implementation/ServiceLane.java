import java.util.*;


/**
 * Calvin is driving his favorite vehicle on the 101 freeway. 
 * He notices that the check engine light of his vehicle is on,
 * and he wants to service it immediately to avoid any risks.
 * Luckily, a service lane runs parallel to the highway. The length
 * of the highway and the service lane is N units. The service lane 
 * consists of N segments of unit length, where each segment can
 * have different widths
 * */

// Following is a segment tree based approach. For this simple case, you can also maintain 3 arrays and solve its
public class ServiceLane {
  
  static class Segment {
   int x, y;
   Segment left, right;
   int min;
   Segment(int x, int y) {
    this.x = x;
    this.y = y;
   }
  }
  
  static Segment createSegmentTree(int[] arr, int x, int y) {
    if ( x == y) {
     Segment leaf = new Segment(x, y);
     leaf.min = arr[x];
     return leaf;
    }
    else {
     Segment node = new Segment(x, y);
     int mid = x + (y - x)/2;
     node.left = createSegmentTree(arr, x, mid);
     node.right = createSegmentTree(arr, mid + 1, y);
     node.min = Math.min(node.left.min, node.right.min);
     return node;
    }
  }
  
  
  static int searchMin(Segment head, int x, int y) {
    if (head != null) {
     // System.out.println("Searching in node " + head.x + " , " + head.y + " for index " + x + ", " + y); 
       //if segment is contained within x and y return segment.min
      if (head.x >= x && head.y <= y) {
        return head.min;
      }
      else {
       int mid = head.x + (head.y - head.x)/2;
       if (y <= mid)
         return searchMin(head.left, x, y);
       else if (x > mid)
         return searchMin(head.right, x, y);
       else
         return Math.min(searchMin(head.left, x, y), searchMin(head.right, x, y));
      }
    }
    return Integer.MAX_VALUE;
  }
    
    
    
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int t = in.nextInt();
   int[] arr = new int[n];
   for (int i = 0; i < n; i++)
     arr[i] = in.nextInt();
   Segment head = createSegmentTree(arr, 0, n - 1);
   while ( t-- > 0) {
     int x = in.nextInt();
     int y = in.nextInt();
     System.out.println(searchMin(head, x, y));
   }
  }
}