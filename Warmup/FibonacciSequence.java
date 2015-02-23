import java.util.*;

/**
 * You are given an integer, N. Write a program to determine if N is an element of the Fibonacci Sequence
 * */

public class FibonacciSequence {
  
  
  // Other solutions include precomputing fibonacci and doing binary search. 60th fibonacci is 13 digits long
  // 5n2 +- 4 is a perfect square for a number to be fibonacci
  static String isFibo(long n) {
   long f1 = 0;
   long f2 = 1;
   if (n == f1 || n == f2)
     return "IsFibo";
   else {
     while (f2 < n) {
      long temp = f2;
      f2 = f1 + f2;
      f1 = temp;
     }
     if (f2 == n)
       return "IsFibo";
     else
       return "IsNotFibo";
   }
  }
  
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int T = in.nextInt();
   while (T-- > 0) {
    long N = Long.parseLong(in.next());
    System.out.println(isFibo(N));
   }
  }
}