// Salesman Problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SalesmanProblem {

    static PriorityQueue<Integer> q = new PriorityQueue<>();
    static int minimumTime(int[] x) {
        for(int i=0;i<x.length;i++){
            q.add(x[i]);
        }
        int first = q.poll();
        int sum = 0;
        while(!q.isEmpty()){
            int second = q.poll();
            sum = sum + (second-first);
            first = second;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] x = new int[n];
            for(int x_i = 0; x_i < n; x_i++){
                x[x_i] = in.nextInt();
            }
            int result = minimumTime(x);
            System.out.println(result);
        }
        in.close();
    }
}
