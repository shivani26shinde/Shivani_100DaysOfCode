// Extra Sweet - Women's CodeSprint 4 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExtraSweet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int[] array = new int[n];
        for(int a0 = 0; a0 < s; a0++){
            int l = in.nextInt();
            int r = in.nextInt();
            int min = l;
            int max = r;
            int sum = 0;
            for(int i=l;i<=r;i++){
                array[i] = -1;
                sum = sum + i;
            }
            while(min >= 0 && array[min] == -1){
                min--;
            }
            if(min >= 0 && array[min] != -1){
                array[min] = -1;
                sum = sum + min;
            }
            while(max < n && array[max] == -1){
                max++;
            }
            if(max < n && array[max] != -1){
                array[max] = -1;
                sum = sum + max;
            }
            System.out.println(sum);
        }
        in.close();
    }
}
