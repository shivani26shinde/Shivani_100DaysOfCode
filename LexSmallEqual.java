// Lexicographically smaller or equal strings

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LexSmallEqual {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] z = new String[n];
        for(int z_i = 0; z_i < n; z_i++){
            z[z_i] = in.next();
        }
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int l = in.nextInt();
            int r = in.nextInt();
            String s = in.next();
            int count = 0;
            for(int i=l-1;i<r;i++){
                String temp = z[i];
                if(temp.equals(s)){
                    break;
                }
                else{
                    int start1 = 0;
                    int start2 = 0;
                    while(start1 < temp.length() && start2 < s.length()){
                        if(temp.charAt(start1) <= s.charAt(start2)){
                            start1++;
                        } 
                        else{  
                            start2++;
                        }
                    }
                    if(start1 >= temp.length()){
                        count++;
                    }
                }
            } 
            System.out.println(count);
        }
        in.close();
    }
}
