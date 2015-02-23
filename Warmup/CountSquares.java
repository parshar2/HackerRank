import java.util.*;

/**Watson gives two integers A & B to Sherlock and asks if he 
  * can count the number of square integers between A and B (both inclusive).
  * */

public class CountSquares {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int T = in.nextInt();
   while (T-- > 0) {
    int l = in.nextInt();
    int r = in.nextInt();
    int lIndex = (int)Math.sqrt(l);
    int count = 0;
    if (lIndex * lIndex == l)
      count++;
    lIndex++;
    while (lIndex * lIndex <= r) {
     count++; lIndex++; 
    }
    System.out.println(count);
   }
  }
}