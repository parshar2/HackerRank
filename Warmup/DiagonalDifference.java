import java.util.Scanner;
/**
 * You are given a square matrix of size N×N. Calculate the absolute difference of the sums across the 
 * two main diagonals.
 * 
 * */

public class DiagonalDifference {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int lDiagonal = 0, rDiagonal = 0;
   for (int i = 0; i < n; i++) {
     for (int j = 0; j < n; j++) {
       int num = in.nextInt();
       if ( i == j)
         lDiagonal += num;
       if ( i + j == (n -1))
         rDiagonal += num;
     }
   }
   System.out.println(Math.abs(lDiagonal - rDiagonal));
  }
  
}