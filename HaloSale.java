// Haloween Sale

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HaloSale {

    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int num = 0;
        int sum = 0;
        int prev = 0;
        sum = sum+p;
        if(s<sum){
            return num;
        }
        prev = sum-d;
        num++;
        while(sum<s){
            if(prev>m){
                sum = sum+prev;
            }
            else{
                sum = sum+m;
            }
            num++;
            prev = prev-d;
        }
        return num-1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        in.close();
    }
}
