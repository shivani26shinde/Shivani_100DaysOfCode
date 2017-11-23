// Buying Everything

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BuyingEverything {

    static long minimumTime(int[] b, int m, int k) {
        long[][] array = new long[m][b.length];
        array[0][0] = 0;
        for(int i=1;i<b.length;i++){
            if(b[i] == 0){
                array[0][i] = array[0][i-1];
            }
            else{
                array[0][i] = i;
            }
        }
        for(int i=1;i<m;i++){
            array[i][0] = 0;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<b.length;j++){
                if(b[j] == 0){
                    array[i][j] = array[i][j-1];
                }
                else{
                    long val = array[i-1][j-1] + (array[0][j]-array[0][j-1])*i*k;
                    array[i][j] = val;
                }
            }
        }
        int count = 0;
        int start = 0;
        while(start<b.length){
            if(b[start] == 1){
                count++;
            }
            if(count == m){
                break;
            }
            start++;
        }
        if(count < m){
            return -1;
        }
        long min = Long.MAX_VALUE;
        for(int i=start;i<b.length;i++){
            if(array[m-1][i] < min){
                min = array[m-1][i];
            }
        }
        return min;              
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[] b = new int[n];
        for(int b_i = 0; b_i < n; b_i++){
            b[b_i] = in.nextInt();
        }
        long result = minimumTime(b, m, k);
        System.out.println(result);
        in.close();
    }
}
