import java.util.*;

/*
 * Manasa is out on a hike with friends. She finds a trail of stones with numbers on them. 
 * She starts following the trail and notices that two consecutive stones have a difference 
 * of either a or b. Legend has it that there is a treasure trove at the end of the trail 
 * and if Manasa can guess the value of the last stone, the treasure would be hers. Given 
 * that the number on the first stone was 0, find all the possible values for the number on the last stone.
 * 
 * 
 * */

public class Stones {
  
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int T = in.nextInt();
   while (T-- > 0) {
    long n = in.nextInt();
    long a = in.nextInt();
    long b = in.nextInt();
    long s = a + b;
    a = Math.min(a, b);
    b = s - a;
    if (a == b)
      System.out.print( (n - 1) * a);
    else {
    for (int i = 0; i <= n -1; i++)
      System.out.print(i*b + (n - 1 - i)*a + " ");
    }
    System.out.println();
      
   }
    
  }
}