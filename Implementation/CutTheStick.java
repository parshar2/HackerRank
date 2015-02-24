import java.util.*;

/**
 * You are given N sticks, where each stick is of positive integral length.
 * A cut operation is performed on the sticks such that all of them are reduced 
 * by the length of the smallest stick.
 * 
 * 
 * */

public class CutTheStick {
  
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
   int num = n;
   while (n-- > 0 ) {
    int i = in.nextInt();
    if (!map.containsKey(i))
      map.put(i, 1);
    else {
     int count = map.get(i);
     map.put(i, count + 1);
    }
   }
   n = num;
   int consumed = 0;
   do {
   System.out.println(n - consumed);
   consumed += map.firstEntry().getValue();
   map.remove(map.firstKey());
   }
   while (!map.isEmpty());
   }
  }