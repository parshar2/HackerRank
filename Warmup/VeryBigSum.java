import java.util.Scanner;
/**
 * You are given an array of integers of size N. You need to print the sum of the elements of the array.
 * */

public class VeryBigSum {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int N = in.nextInt();
   long sum = 0;
   while (N-- > 0) {
     sum += in.nextInt();
   }
   System.out.println(sum);
  }
  
}