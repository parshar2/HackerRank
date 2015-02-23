import java.util.*;


/**
 * You are given a list of N people who are attending ACM-ICPC World Finals.
 * Each of them are either well versed in a topic or they are not. Find out 
 * the maximum number of topics a 2-person team can know. And also find out 
 * how many teams can know that maximum number of topics.
 * 
 * 
 * */

public class ACMICPC {
  
  
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int N = in.nextInt();
   int M  = in.nextInt();
   
   // This array may not be necessary. Could just use two variables - max and count 
   int[] arr = new int[M + 1];  // stores number of teams that know i topics
   String[] input = new String[N];
   while (N-- > 0)
     input[N] = in.next();
   
   for (int i = 0; i < input.length - 1; i++) {
     for (int j = i + 1; j < input.length; j++) {
      int numTopics = 0;
      for (int k = 0; k < M; k++) {
       if (input[i].charAt(k) == '1' || input[j].charAt(k) == '1')
         numTopics++;
      }
       arr[numTopics]++;
     }
   }
   
   for (int i = arr.length - 1; i >= 0; i--) {
     if (arr[i] != 0) {
      System.out.println(i);
      System.out.println(arr[i]);
      break;
     }
   }
   
  }
  
  
}