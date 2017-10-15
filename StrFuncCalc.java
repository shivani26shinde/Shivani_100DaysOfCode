// String Function Calculation (Inefficient)

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrFuncCalc {

    static Map<String, Integer> map = new TreeMap<>();
	static HashSet<Integer> set = new HashSet<>();
    static int ans = Integer.MIN_VALUE;
    static int maxValue(String t) {
        Recur(0, t);
        for(String i : map.keySet()){
			int val = map.get(i)*(i.length());
			if(val > ans){
                ans = val;
            }
		}
        return ans;
    }
    static void Recur(int start, String a){
            if(start == a.length()){
                return;
            }
            for(int i=start;i<a.length();i++){
                String sub = a.substring(start, i+1);
                int num = start*10 + i;
                if(!map.containsKey(sub)){
                    map.put(sub, 1);
                    set.add(num);
                }
                else{
                    if(!set.contains(num)){
                        int val = map.get(sub);
                        map.put(sub, val+1);
                        set.add(num);
                    }
                }
                Recur(start+1, a);
            }
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.next();
        int result = maxValue(t);
        System.out.println(result);
        in.close();
    }
}
