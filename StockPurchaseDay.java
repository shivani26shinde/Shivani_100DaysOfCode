// Stock Purchase Day 

// Inefficient
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StockPurchaseDay {
    static Map<Integer, Integer> map = new TreeMap<>();
    static PriorityQueue<Integer> queue;
    static int lowElm = Integer.MAX_VALUE;
    static int highElm = Integer.MIN_VALUE;
    static int stockPurchaseDay(int[] A, int xi) {
        int val = -1;
        if(map.containsKey(xi)){
            return map.get(xi);
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
            int num = A_i + 1;
            if(A[A_i] < lowElm){
                lowElm = A[A_i];
            }
            if(A[A_i] > highElm){
                highElm = A[A_i];
            }
            map.put(A[A_i], num);       
        }
        for(int i=lowElm+1;i<=highElm;i++){
            int val = i-1;
            if(!map.containsKey(i)){
                map.put(i, map.get(val));
            }
            else if(map.get(val) > map.get(i)){
                map.put(i, map.get(val));
            }
        }
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int xi = in.nextInt();
            int result = stockPurchaseDay(A, xi);
            System.out.println(result);
        }
        in.close();
    }
}

// Efficient
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int min  = Integer.MAX_VALUE;
    static int stockPurchaseDay(int[] A, int xi) {
        if(xi<min){
            return -1;
        }
        for(int i=A.length-1;i>=0;i--){
            if(A[i] <= xi){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
            if(min > A[A_i]){
                min = A[A_i];
            }
        }
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int xi = in.nextInt();
            int result = stockPurchaseDay(A, xi);
            System.out.println(result);
        }
        in.close();
    }
}


