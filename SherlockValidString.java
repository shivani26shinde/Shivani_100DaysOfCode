// Sherlock and Valid String

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockValidString {
    static HashMap<Character, Integer> map = new HashMap<>();
    static HashMap<Integer, Integer> count = new HashMap<>();
    static String isValid(String s){
       
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int val = map.get(s.charAt(i));
                map.put(s.charAt(i), val+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        List<Integer> list = new ArrayList<>(map.values());
        for(int i=0;i<list.size();i++){
            if(count.containsKey(list.get(i))){
                int val = count.get(list.get(i));
                count.put(list.get(i), val+1);
            }
            else{
                count.put(list.get(i), 1);
            }
        }
        if(count.size() == 1){
            return "YES";
        }
        if(count.size() > 2){
            return "NO";
        }
        int val1 = (Integer) count.get(count.keySet().toArray()[0]);
        int val2 = (Integer) count.get(count.keySet().toArray()[1]);
        if(val1>1 && val2>1){
            return "NO";
        }
        int key1 = (Integer) count.keySet().toArray()[0];
        int key2 = (Integer) count.keySet().toArray()[1];
        if(val1 == 1 && val2 == 1){
            if(key1-key2 == 1 || key2-key1 == 1){
                return "YES";
            }
            else{
                return "NO";
            }
        }
        if(val1 == 1){
            if(key1 == 1){
                return "YES";
            }
            else if(key1-1 == key2){
                return  "YES";
            }
        }
        if(val2 == 1){
            if(key2 == 1){
                return "YES";
            }
            else if(key2-1 == key1){
                return  "YES";
            }
        }
        
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
