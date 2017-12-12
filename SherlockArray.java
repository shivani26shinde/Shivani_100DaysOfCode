// Sherlock and Array

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockArray {

    static String solve(int[] a){
        int[] a1 = new int[a.length];
        int[] a2 = new int[a.length];
        a1[0] = a[0];
        a2[a.length-1] = a[a.length-1];
        for(int i=1;i<a.length;i++){
            a1[i] = a[i]+a1[i-1];
        }
        for(int i=a.length-2;i>=0;i--){
            a2[i] = a[i]+a2[i+1];
        }
        for(int i=0;i<a.length;i++){
            if(a1[i] == a2[i]){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}
