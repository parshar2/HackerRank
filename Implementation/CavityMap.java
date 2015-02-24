import java.util.*;

/**
 * You are given a square n?n map. Each cell of the map has a value in it
 * denoting the depth of the appropriate area. We will call a cell of the 
 * map a cavity if and only if this cell is not on the border of the map 
* and each cell adjacent to it has strictly smaller depth. Two cells are 
 * adjacent if they have a common side.
 * You need to find all the cavities on the map and depict them with character uppercase X.
 * 
 * */

public class CavityMap {
  
  // another neat way of checking is to use two arrays
  // int[] dx = new int[]{ 1, 0, -1, 0, };
  // int[] dy = new int[]{ 0, 1, 0, -1, 0, };
  // and iterate over k = 0 - 3
    static boolean isCavity(char[][] map, int x, int y) {
   
    if (map[x - 1][y] >= map[x][y])
      return false;
    if (map[x + 1][y] >= map[x][y])
      return false;
    if (map[x][y - 1] >= map[x][y])
      return false;
    if (map[x][y + 1] >= map[x][y])
      return false;
    return true;
  }
  
  static void printMatrix(char[][] map) {
   System.out.print("Number of rows " + map.length);
   System.out.print("Number of columns " + map[0].length);
  }
 
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   char map[][] = new char[n][];
   for (int i = 0; i < n; i++) {
    map[i] = in.next().toCharArray();
   }
   
   for (int i = 0; i < n ; i++) {// denotes the row
     for (int j = 0; j < n ; j++) { // denotes the column
       if (i == 0 || i == n -1)
         System.out.print(map[i][j]);
       else if (j == 0 || j == n -1)
         System.out.print(map[i][j]);
       else if (isCavity(map, i, j))
         System.out.print('X');
       else
          System.out.print(map[i][j]);
     }
     System.out.println();
   }
   
  }
}