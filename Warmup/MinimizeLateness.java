import java.util.*;

/**
 * Given a list of N integers, your task is to select K integers from the list such that its unfairness is minimized.
 * if (x1,x2,x3,É,xk) are K numbers selected from the list N, the unfairness is defined as
 * max(x1,x2,É,xk)?min(x1,x2,É,xk)
 * where max denotes the largest integer among the elements of K, and min denotes the smallest integer among the elements of K.
 * 
 * */

public class MinimizeLateness {
  
  
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int N = in.nextInt();
   int K = in.nextInt();
   int arr[] = new int[N];
   while (N-- > 0) 
     arr[N] = in.nextInt();
   Arrays.sort(arr);
   int min = Integer.MAX_VALUE;
   for (int i = 0; i <= arr.length - K; i++) {
     min = Math.min(min, arr[i + K - 1] - arr[i]);
   }
   System.out.println(min);
  }
  
}