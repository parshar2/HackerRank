import java.util.*;

/**
 * Little Bob loves chocolates, and goes to a store with $N in his pocket. 
 * The price of each chocolate is $C. The store offers a discount: for every
 * M wrappers he gives to the store, he gets one chocolate for free. How many
 * chocolates does Bob get to eat?
 * */

public class ChocolateFeast {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int T = in.nextInt();
   while (T-- > 0) {
     int n = in.nextInt();
     int c = in.nextInt();
     int m = in.nextInt();
     int nCandies = n/c;
     int nWrappers  = nCandies;
     while (nWrappers >= m) {
      nCandies += nWrappers/m;
      nWrappers = nWrappers/m + nWrappers%m;
     }
     System.out.println(nCandies);
   }
  }
}