// Factorial Array

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FactorialArray {
    
    public static long Fact(int num){
        long fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] A = new int[n];
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < m; a0++){
            int rank = in.nextInt();
            int num1 = in.nextInt() - 1;
            int num2 = in.nextInt();
            if(rank == 1){
                for(int i=num1;i<num2;i++){
                    A[i] = A[i] + 1;
                }
            }
            else if(rank == 2){
                long sum = 0;
                for(int i=num1;i<num2;i++){
                    sum = sum + Fact(A[i]);
                }
                sum = sum % (long) Math.pow(10, 9);
                System.out.println(sum);
            }
            else if(rank == 3){
                A[num1] = num2;
            }
        }
        in.close();
    }
}
