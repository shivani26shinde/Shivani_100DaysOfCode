// Sum Vs XOR

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumXOR {

    static long solve(long n) {
        int count = 0;
        while(n != 0){
            if((n&1)==0){
                count++;
            }
            n = n>>1;
        }
        long val = (long) Math.pow(2,count);
        return val;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long result = solve(n);
        System.out.println(result);
    }
}
