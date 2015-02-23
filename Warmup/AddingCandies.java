import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Animesh has N empty candy jars, numbered from 1 to N, with infinite capacity. 
 * He performs M operations. Each operation is described by 3 integers a, b and k.
 * Here, a and b are indices of the jars, and k is the number of candies to be added 
 * inside each jar whose index lies between a and b (both inclusive). Can you tell 
 * the average number of candies after M operations?
 * */

public class AddingCandies {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        long N = (long)in.nextInt();
        int M = in.nextInt();
        long totCandies = 0;
        while (M-- > 0) {
         long a = in.nextInt();
         long b = in.nextInt();
         long c = in.nextInt();
         totCandies += (b - a + 1)*c;
        }
      System.out.println(totCandies / N);
    }
}