// Sparse arrays

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String arr[] = new String[n];

        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
    }
        int a = in.nextInt();
        String arr1[] = new String[a];
        for(int arr_j=0; arr_j < a; arr_j++){
            arr1[arr_j] = in.next();
        }
        for(int i=0; i<a; i++){
        int count = 0;
            for(int j=0; j<n; j++){
                if(arr1[i].contains(arr[j])){
                    count++;
                }
            } System.out.println(+count);
        }
    }}