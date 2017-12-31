// Red Knight's Shortest Path - Recursive

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RedKnightPathRecur {

    static int f_i = 0;
    static int f_j = 0;
    static int num = 0;
    static int ShortestPath(int i, int j){
        if(i < 0 || j < 0 || i >= num || j >= num){
            return 0;
        }
        if(i == f_i && j == f_j){
            return 0;
        }
        return 1 + Min(ShortestPath(i-2, j),
                       ShortestPath(i+2, j),
                       ShortestPath(i-1, j+2),
                       ShortestPath(i-1, j-2),
                       ShortestPath(i+1, j+2),
                       ShortestPath(i+1, j-2)
                      );
    }
    static int Min(int a, int b, int c, int d, int e, int f){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(a);
        pq.add(b);
        pq.add(c);
        pq.add(d);
        pq.add(e);
        pq.add(f);
        return pq.peek();
    }
    static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {
        f_i = i_end;
        f_j = j_end;
        num = n;
        int val = ShortestPath(i_start, j_start);
        System.out.println(val);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i_start = in.nextInt();
        int j_start = in.nextInt();
        int i_end = in.nextInt();
        int j_end = in.nextInt();
        printShortestPath(n, i_start, j_start, i_end, j_end);
        in.close();
    }
}
