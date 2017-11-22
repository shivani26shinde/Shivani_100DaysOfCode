// Beautiful OR Ugly (have certain conditions for passing)

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UglyBeautifulUglyBeautiful {

    static String uglyOrBeautiful(int[] a) {
        int len = a.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<len;i++){
            if(set.contains(a[i])){
                return "Ugly";
            }
            else if(a[i]<1 || a[i]>len){
                return "Ugly";
            }
            else{
                set.add(a[i]);
            }
        }
        int start = 0;
        while(start<len){
            if(a[start] != start+1){
                return "Beautiful";
            }
            start++;
        }
        if(start == len){
            return "Ugly";
        }
        return "Beautiful";        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = uglyOrBeautiful(a);
            System.out.println(result);
        }
        in.close();
    }
}
