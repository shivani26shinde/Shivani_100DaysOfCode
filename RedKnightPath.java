// Red Knight's Shortest Path

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RedKnightPath {

    static Queue<ArrayList<Integer>> queue = new LinkedList<>();
    static int num = 0;
    static boolean Valid(int i, int j){
        if(i < 0 || j < 0 || i >= num || j >= num){
            return false;
        }
        return true;
    }
    static int ShortestPath(int fi, int fj, int n){
        int[][] array = new int[n][n];
        for(int s=0;s<n;s++){
            for(int t=0;t<n;t++){
                array[s][t] = 0;
            }
        }
        while(!queue.isEmpty()){
            ArrayList<Integer> listNew = queue.poll();
            int i = listNew.get(0);
            int j = listNew.get(1);
            int dist = listNew.get(2);
            if(i == fj && j == fi){
                return dist;
            }
            if(array[i][j] == 0){
                array[i][j] = 1;
                if(Valid(i-2, j) == true){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i-2);
                    list.add(j);
                    list.add(dist+1);
                    queue.add(list);
                }
                if(Valid(i+2, j) == true){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i+2);
                    list.add(j);
                    list.add(dist+1);
                    queue.add(list);
                }
                if(Valid(i-1, j+2) == true){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i-1);
                    list.add(j+2);
                    list.add(dist+1);
                    queue.add(list);
                }
                if(Valid(i-1, j-2) == true){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i-1);
                    list.add(j-2);
                    list.add(dist+1);
                    queue.add(list);
                }
                if(Valid(i+1, j+2) == true){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i+1);
                    list.add(j+2);
                    list.add(dist+1);
                    queue.add(list);
                }
                if(Valid(i+1, j-2) == true){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i+1);
                    list.add(j-2);
                    list.add(dist+1);
                    queue.add(list);
                }
            }  
        }
        return Integer.MAX_VALUE;
    }
    
    static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {
        num = n;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(j_start);
        list.add(i_start);
        list.add(0);
        queue.add(list);
        int val = ShortestPath(i_end, j_end, n);
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
