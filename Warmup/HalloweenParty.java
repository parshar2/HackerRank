import java.util.*;

/**
 * Alex is attending a Halloween party with his girlfriend Silvia. At the party, 
 * Silvia spots the corner of an infinite chocolate bar. If the chocolate can be
 * served as only 1 x 1 sized pieces and Alex can cut the chocolate bar exactly K
 * times, what is the maximum number of chocolate pieces Alex can cut and give Silvia?
 * */

public class HalloweenParty {
  
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int T = in.nextInt();
   while (T-- > 0) {
    long n = in.nextInt();
    System.out.println( n/2 * (n/2 + n%2));
   }
  }
}