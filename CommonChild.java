// Common Child

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CommonChild {

    static int commonChild(String s1, String s2){
        int[][] array = new int[s2.length()+1][s1.length()+1];
        for(int i=0;i<=s2.length();i++){
            array[i][0] = 0;
        }
        for(int j=0;j<=s1.length();j++){
            array[0][j] = 0;
        }
        for(int i=1;i<=s2.length();i++){
            for(int j=1;j<=s1.length();j++){
                if(s2.charAt(i-1) == s1.charAt(j-1)){
                    array[i][j] = 1+array[i-1][j-1];
                }
                else{
                    array[i][j] = Math.max(array[i-1][j],array[i][j-1]);
                }
            }
        }
        return array[s2.length()][s2.length()];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = commonChild(s1, s2);
        System.out.println(result);
    }
}
