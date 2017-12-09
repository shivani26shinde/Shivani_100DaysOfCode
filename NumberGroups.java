// Number Groups

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NumberGroups {

    static long sumOfGroup(int k) {
        // Return the sum of the elements of the k'th group.
        long start = 1;
        long sum = 0;
        for(int i=1;i<=k;i++){
            long count = 0;
            sum = 0;
            while(count<i){
                if(start%2 == 1){
                    sum = sum+start;
                    count++;
                }
                start++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        long answer = sumOfGroup(k);
        System.out.println(answer);
        in.close();
    }
}
