import java.util.*;

/**
 * James found a love letter his friend Harry has written for his girlfriend. 
 * James is a prankster, so he decides to meddle with the letter. He changes 
 * all the words in the letter into palindromes.
 * 
 * 
 * */

public class LoveLetterMystery {
 
  
  static int minOperations(String str) {
   int len = str.length();
   int l = 0, r = len -1;
   int ops = 0;
   while ( l < r) {
     ops += Math.abs(str.charAt(l) - str.charAt(r));
     l++; r--;
   }
    return ops;
  }
  
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int T = in.nextInt();
   while ( T-- > 0) {
    String str = in.next();
    System.out.println(minOperations(str));
   }
  }
  
}