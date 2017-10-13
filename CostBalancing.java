// Cost Balancing

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CostBalancing {

    static Map<Integer, Integer> map = new TreeMap<>();
    static int sum = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int id_number = in.nextInt();
            int amount = in.nextInt();
            if(!map.containsKey(id_number)){
                map.put(id_number, amount);
            }
            else{
                int val = map.get(id_number) + amount;
                map.put(id_number, val);
            }
            sum = sum+amount;
        }
        int num = sum/m;
        if(sum%m == 0){
            for(Integer i : map.keySet()){
                int calc = map.get(i) - num;
                System.out.println(i+" "+calc);
            }
        }
        else{
            int diff = sum-(num*m);
            for(Integer i: map.keySet()){
                if(i == 1){
                    int calc = map.get(i) - (num + diff);
                    System.out.println(i+" "+calc);
                }
                else{
                    int calc = map.get(i) - num;
                    System.out.println(i+" "+calc);
                }
            }
        }
        in.close();
    }
}
