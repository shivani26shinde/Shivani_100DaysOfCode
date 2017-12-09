// Number Groups // Optimized

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long sumOfGroup(int k) {
        long sum = 0;
        long start = 1;
        for(int i=1;i<k;i++){
            start = start+2*i;
        }
        for(int i=1;i<=k;i++){
            sum = sum+start;
            start = start+2;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        long answer = sumOfGroup(k);
        System.out.println(answer);
        in.close();
    }
}

// Number Groups // Brute Force

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NumberGroups {

    static long sumOfGroup(int k) {
        // Return the sum of the elements of the k'th group.
        long start = 1;
        long sum = 0;
        for(int i=1;i<=k;i++){
            long count = 0;
            sum = 0;
            while(count<i){
                if(start%2 == 1){
                    sum = sum+start;
                    count++;
                }
                start++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        long answer = sumOfGroup(k);
        System.out.println(answer);
        in.close();
    }
}
