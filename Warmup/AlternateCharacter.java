import java.util.*;
/**
 * Shashank likes strings in which consecutive characters are different. 
 * For example, he likes ABABA, while he doesn't like ABAA. Given a string 
 * containing characters A and B only, he wants to change it into a string 
 * he likes. To do this, he is allowed to delete the characters in the string. 
 * Your task is to find the minimum number of required deletions.
 * 
 * */

public class AlternateCharacter {
  
  
  // Could have just used charAt(i) != charAt(i-1)
  static int minDeletions(String str) {
   int L = str.length();
   if (L == 0) 
     return 0;
   int numDeletions = 0;
   char prev  = str.charAt(0);
   for (int i = 1; i < L; i++) {
    if (str.charAt(i) == prev)
      numDeletions++;
    else
      prev = str.charAt(i);
   }
   return numDeletions;
  }
  
  
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int T = in.nextInt();
   for (int i = 0; i < T; i++) {
    String str = in.next();
    System.out.println(minDeletions(str));
   }
    
  }  
}