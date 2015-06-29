import java.util.Scanner;
/**Julius Caesar protected his confidential information from his enemies by encrypting it. 
  * Caesar rotated every letter in the string by a fixed number K. This made the string 
  * unreadable by the enemy. You are given a string S and the number K. Encrypt the string and print the encrypted string.
 * 
 * */

public class CaesarCipher {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   String s = in.next();
   int k = in.nextInt();
    k = k % 26;
    for (char c : s.toCharArray()) {
     int ascii = c;
     if (ascii >= 65 && ascii <= ( 90 - k)) 
       ascii = ascii + k;
     else if (ascii > (90 - k) && ascii <= 90)
       ascii = ascii + (k - 26);
     else if (ascii >= 97 && ascii <= ( 122 - k)) 
       ascii = ascii + k;
     else if (ascii > (122 - k) && ascii <= 122)
       ascii = ascii + (k - 26);
     System.out.print((char)ascii);
     }
    }
  }