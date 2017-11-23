// Subsequence again

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubsequenceAgain {

    static String subsequenceAgain(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int val = map.get(c) + 1;
                map.put(c, val);
            }
            else{
                map.put(c, 1);
            }
        }
        for(Character c: map.keySet()){
            int val = map.get(c);
            if(val<k){
                set.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!set.contains(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        String result = subsequenceAgain(s, k);
        System.out.println(result);
        in.close();
    }
}
