import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * You will be given a list of 32 bits unsigned integers. 
 * You are required to output the list of the unsigned integers 
 * you get by flipping bits in its binary representation (i.e. unset bits must be set, and set bits must be unset).
 * 
 * */
public class FlipBits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        // Get value of 2^32 - 1
        long upper = (((long)1)<<32) -1;
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            long num = (long)in.nextLong();
            System.out.println(upper - num);
            
        }
    }
}