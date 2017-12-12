// Pairs

import java.io.*;
import java.util.*;

public class Pairs {

    static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        int count = 0;
        for(Integer i: set){
            int val = i+k;
            if(set.contains(val)){
                count++;
            }
        }
        System.out.println(count);
    }
}