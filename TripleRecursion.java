// Triple Recursion without using recursion but using memoization

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TripleRecursion {

    static void tripleRecursion(int n, int m, int k) {
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    matrix[i][j] = m;
                }
                else if(i == j){
                    matrix[i][j] = matrix[i-1][j-1] + k;
                }
                else if(i > j){
                    matrix[i][j] = matrix[i-1][j] - 1;
                }
                else if(i < j){
                    matrix[i][j] = matrix[i][j-1] - 1;
                }
            }
        } 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        tripleRecursion(n, m, k);
        in.close();
    }
}
