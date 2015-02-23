
import java.util.*;

/**
 * Given two integers, L and R, find the maximal values of A xor B, where A and B satisfies the following condition:
 * L²A²B²R
 */

public class MaximalXOR {
  
  
  static int findMaximalXOR(int L, int R) {
   int max = 0;
   for (int i = L; i < R; i++) {
     for (int j = i + 1; j <= R; j++) {
      max = Math.max(max, i^j);
     }
   }
   return max;
  }
  
  public static void main(String[] args) {
    
   Scanner in = new Scanner(System.in);
   int L = in.nextInt();
   int R  = in.nextInt();
   System.out.println(findMaximalXOR(L, R));
  }
  
  
  
  
  
}