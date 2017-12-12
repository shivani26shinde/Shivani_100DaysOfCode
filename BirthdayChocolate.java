// Birthday Chocolate

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayChocolate {
    
    static int solve(int n, int[] s, int d, int m){
        int sum = 0;
        int count = 0;
        for(int i=0;i<m;i++){
            sum = sum+s[i];
        }
        if(sum == d){
            count++;
        }
        int j = 0;
        sum = sum-s[j];
        j++;
        int start = m;
        while(start<s.length){
            sum = sum+s[start];
            if(sum == d){
                count++;
            }
            sum = sum-s[j];
            j++;
            start++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
