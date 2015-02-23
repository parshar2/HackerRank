import java.util.*;


/**
 * This afternoon, Sherlock received a note from Moriarty, saying that he has infected 'The Beast' 
 * with a virus. Moreover, the note had the number N printed on it. After doing some calculations, 
 * Sherlock figured out that the key to remove the virus is the largest 'Decent' Number having N digits.
 * */

public class SherlockAndBeast {
  
  
  //With careful thinking the number of trailing threes = ((2?n)%3)?5 . This is an O(1) solution. Code written below is O(n)
  static int numThree(int N) {
   int numFive = N/3;
   int numThree = N%3;
   while (numFive != 0 && numThree % 5 != 0) {
    numFive--;
    numThree += 3;
   }
   if (numThree % 5 == 0)
     return numThree;
   return -1;
  }
  
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int T = in.nextInt();
   while (T-- > 0) {
    int N = in.nextInt();
    int numthree = numThree(N);
    if (numthree == -1)
      System.out.println("-1");
    else { 
      int numFive = N - numthree;
      StringBuilder out = new StringBuilder();
      for (int i = 0; i < numFive; i++)
        out.append("5");
      for (int i = 0; i < numthree; i++)
        out.append("3");
      System.out.println(out.toString());
    }
   }
  }
}