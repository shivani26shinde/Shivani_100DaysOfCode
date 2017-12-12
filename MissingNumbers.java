// Missing Numbers

import java.io.*;
import java.util.*;

public class MissingNumbers {

    static HashMap<Integer,Integer> map1 = new HashMap<>();
    static HashMap<Integer,Integer> map2 = new HashMap<>();
    static TreeSet<Integer> set = new TreeSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        for(int i=0;i<n1;i++){
            int val = sc.nextInt();
            if(map1.containsKey(val)){
                map1.put(val, map1.get(val)+1);
            }
            else{
                map1.put(val, 1);
            }
        }
        int n2 = sc.nextInt();
        for(int i=0;i<n2;i++){
            int val = sc.nextInt();
            if(map2.containsKey(val)){
                map2.put(val, map2.get(val)+1);
            }
            else{
                map2.put(val, 1);
            }
        }
        int num = 0;
        for(Integer i: map2.keySet()){
            int val1 = map2.get(i);
            if(map1.containsKey(i)){
                val1 = val1 - map1.get(i);
            }
            for(int k=0;k<val1;k++){
                set.add(i);
            }
        }
        for(Integer i : set){
            System.out.print(i+" ");
        }
    }
}