// Interval Selection (Incomplete)

import java.io.*;
import java.util.*;

public class IntervalSelection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int value = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int ans = 0;
            for(int j=0;j<value;j++){
                int val1 = sc.nextInt();
                int val2 = sc.nextInt();
                if(val1 < min){
                    min = val1;
                }
                if(val2 > max){
                    max = val2;
                }
                for(int k=val1;k<=val2;k++){
                    if(map.containsKey(k)){
                        int num = map.get(k);
                        System.out.println("NUM "+num);
                        if(num == 2){
                            map.put(k, -1);
                            ans++;
                        }
                        else if(num == -1){
                            continue;
                        }
                        else{
                            num++;
                            map.put(k, num);
                        }
                    }
                    else{
                        map.put(k, 1);
                    }
                }
            }
            int ret = value - ans;
            System.out.println(ret);
        }
    }
}