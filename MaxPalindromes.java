// Maximum Palindromes

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxPalindromes {
    
    static String word;
    static HashMap<Character, Integer> map;
    
    static int Fact(int num){
        int res = 1;
        for(int i=1;i<=num;i++){
            res = res * i;
        }
        return res;
    }
    
    static void initialize(String s) {
        word = s;
    }

    static int answerQuery(int l, int r) {
        map = new HashMap<>();
        for(int i=l-1;i<r;i++){
            Character c = word.charAt(i);
            if(map.containsKey(c)){
                int val = map.get(c);
                map.put(c, val+1);
            }
            else{
                map.put(c, 1);
            }
        }
        int count1 = 0;
        int count2 = 0;
        for(Character c: map.keySet()){
            int val = map.get(c);
            count1 = count1 + val/2;
            if(val%2 != 0){
                count2 = count2 + 1;
            }
        }
        if(count2 == 0){
            count2 = 1;
        }
        int sum = Fact(count1) * count2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        initialize(s);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int l = in.nextInt();
            int r = in.nextInt();
            int result = answerQuery(l, r);
            System.out.println(result);
        }
        in.close();
    }
}
