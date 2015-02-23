import java.util.*;

/**
 * Sherlock is stuck while solving a problem: Given an array A={a1,a2,?,aN}, 
 * he wants to know if there exists a subset, B={ai1,ai2,�,aik} where 1�i1<i2<�<ik�N,
 * of this array which follows these statements:
 * */

public class Sherlock {
  
  static int gcd(int a, int b) {
   if ( b == 0)
     return a;
   return gcd(b, a%b); 
  }
  
  static String isSubsetPresent(int[] arr) {
   int len = arr.length;
   int g = arr[0];
   for (int i = 1; i < len; i++){
      g = gcd(g, arr[i]);
     }
   return (g == 1 ? "YES" : "NO");
  }
  
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int T = in.nextInt();
   while (T-- > 0) {
    int N = in.nextInt();
    int[] arr = new int[N];
    while (N-- > 0)
      arr[N] = in.nextInt();
    System.out.println(isSubsetPresent(arr));
   }
  }
}