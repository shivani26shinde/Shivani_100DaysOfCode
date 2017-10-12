// Cracking the Coding Interview - Ice Cream Parlor

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IceCreamParlor {

    static HashMap<Integer, Integer> map;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            map = new HashMap<>();
            int m = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            for(int i=0;i<n;i++){
                int val = m - a[i];
                if(map.containsKey(val)){
                    int ans1 = map.get(val)+1;
                    int ans2 = i+1;
                    System.out.println(ans1+" "+ans2);
                    break;
                }
                else{
                    map.put(a[i], i);
                }
            }
        }
    }
}
