import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * The king has a string composed of lowercase English letters. 
 * Help him figure out if any anagram of the string can be a palindrome or not.
 * */

public class PalindromeAnagram {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        String ans;
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        int[] frequency = new int[26];
        Arrays.fill(frequency, 0);
      for (char c : inputString.toCharArray())
        frequency[c - 'a']++;
      
      int numOdd = 0;
      for (int f : frequency) {
       if (f%2 != 0)
         numOdd++;
      }
          
      if (numOdd > 1)
        ans = "NO";
      else
        ans = "YES";
        
        
        System.out.println(ans);
        myScan.close();
    }
}
