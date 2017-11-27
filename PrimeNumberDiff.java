// Given two integers find the difference in the smallest and the largest prime numbers within the given range

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrimeNumberDiff {

    static int maxDifference(int startVal, int endVal) {
        int val1 = Integer.MIN_VALUE;
        int val2 = Integer.MIN_VALUE;
        while(startVal<=endVal){
            if(isPrime(startVal) == true){
                val1 = startVal;
                break;
            }
            startVal++;
        }
        while(endVal>=startVal){
            if(isPrime(endVal) == true){
                val2 = endVal;
                break;
            }
            endVal--;
        }
        if(val1 == Integer.MIN_VALUE || val2 == Integer.MIN_VALUE){
            return 0;
        }
        return val2-val1;
    }
    static boolean isPrime(int val){
        for(int i=2;i<=Math.sqrt(val);i++){
            if(val%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int startVal = in.nextInt();
            int endVal = in.nextInt();
            int result = maxDifference(startVal, endVal);
            System.out.println(result);
        }
        in.close();
    }
}
