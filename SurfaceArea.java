// Surface Area 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SurfaceArea {

    static int surfaceArea(int[][] A) {
        int sum = 0;
        for(int i=0;i<A.length;i++){
            for(int j=1;j<A[0].length;j++){
                sum = sum + Math.abs(A[i][j] - A[i][j-1]);           
            }
        }
        for(int i=1;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                sum = sum + Math.abs(A[i-1][j] - A[i][j]);           
            }
        }
        sum = sum + 2*(A.length)*(A[0].length);
        for(int i=0;i<A.length;i++){
            sum = sum + A[i][0];
        }
        for(int i=0;i<A[0].length;i++){
            sum = sum + A[0][i];
        }
        for(int i=0;i<A[0].length;i++){
            sum = sum + A[A.length-1][i];
        }
        for(int i=0;i<A.length;i++){
            sum = sum + A[i][A[0].length-1];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        int[][] A = new int[H][W];
        for(int A_i = 0; A_i < H; A_i++){
            for(int A_j = 0; A_j < W; A_j++){
                A[A_i][A_j] = in.nextInt();
            }
        }
        int result = surfaceArea(A);
        System.out.println(result);
        in.close();
    }
}
