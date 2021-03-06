import java.util.*;

/**
 * Watson gives an array A1,A2...AN to Sherlock. Then he asks him to find if there 
 * exists an element in the array, such that, the sum of elements on its left is 
 * equal to the sum of elements on its right. If there are no elements to left/right, 
 * then sum is considered to be zero.
 * Formally, find an i, such that, A1+A2...Ai-1 = Ai+1+Ai+2...AN.
 * 
 * */

public class SherlockAndArray {
 
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int T = in.nextInt();
   while (T-- > 0) {
    int n = in.nextInt();
    int[] arr = new int[n];
    long sum = 0;
    for (int i = 0; i < n; i++) {
     arr[i] = in.nextInt();
     sum += arr[i];
    }
    // use of r is unnecessary and can be removed
    long l = 0, r = sum;
    boolean found = false;
    for (int i = 0; i < n; i++) {
      r -= arr[i];
      if ( l == r) {
        found = true;
         break;
      }
      l += arr[i];
    }
    System.out.println(found ? "YES" : "NO");    
   }
  }
}