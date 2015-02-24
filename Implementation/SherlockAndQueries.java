import java.util.*;

/**
 * Watson gives to Sherlock an array: A1,A2,?,AN.
 * He also gives to Sherlock two other arrays: B1,B2,?,BM and C1,C2,?,CM. 
 * 
 * 
 * */

public class SherlockAndQueries {
  
  static int modulo = 1000000007;
  static void recordFrequency(Map<Long, Long> map, long[] b, long[] c) {
    for (int i = 0; i < b.length; i++) {
      if (!map.containsKey(b[i]))
        map.put(b[i], c[i]);
      else {
       long multiple = map.get(b[i]);
       map.put(b[i], (multiple * c[i])%modulo);
      }
    }
  }
  
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int m = in.nextInt();
   long[] a = new long[n];
   long[] b = new long[m];
   long[] c = new long[m];
   for (int i = 0; i < n; i++)
     a[i] = in.nextInt();
   for (int i = 0; i < m; i++)
     b[i] = in.nextInt();
   for (int i = 0; i < m; i++)
     c[i] = in.nextInt();
   
   
   Map<Long, Long> map = new HashMap<Long, Long>();
   recordFrequency(map, b, c);
   for (int i = 0; i < m; i++) {
     long multiple = b[i];
     if (map.containsKey(b[i])) {
       long frequency = map.get(b[i]);
       map.remove(b[i]);
      // System.out.println("Frequency of " + b[i] + " is " + frequency);
       for (long j = b[i]; j <= n; j+= b[i]) {
         a[(int)j - 1] = (a[(int)j- 1] * frequency) % modulo; 
       }
     }
   }
   for (int i = 0; i < n; i++)
     System.out.print(a[i] + " ");
  }
}