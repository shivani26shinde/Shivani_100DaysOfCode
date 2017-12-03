// Twin Arrays

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Set;

public class TwinArrays {
    static HashMap<Integer, Integer> map1 = new HashMap<>();
    static HashMap<Integer, Integer> map2 = new HashMap<>();
    static PriorityQueue<Integer> q1 = new PriorityQueue<>();
    static PriorityQueue<Integer> q2 = new PriorityQueue<>();
    static int twinArrays(int[] ar1, int[] ar2){
        for(int i=0;i<ar1.length;i++){
            map1.put(ar1[i], i);
            q1.add(ar1[i]);
        }
        for(int i=0;i<ar2.length;i++){
            map2.put(ar2[i], i);
            q2.add(ar2[i]);
        }
        while(!q1.isEmpty() && !q2.isEmpty()){
            if(map1.get(q1.peek()) != map2.get(q2.peek())){
                return q1.poll()+q2.poll();
            }
            if(q1.peek() < q2.peek()){
                q2.poll();
            }
            else if(q1.peek() > q2.peek()){
                q1.poll();
            }
            else{
                int num = q1.poll();
                q2.poll();
                int val1 = num+q1.peek();
                int val2 = num+q2.peek();
                if(val1<val2){
                    return val1;
                }
                else{
                    return val2;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar1 = new int[n];
        for(int ar1_i = 0; ar1_i < n; ar1_i++){
            ar1[ar1_i] = in.nextInt();
        }
        int[] ar2 = new int[n];
        for(int ar2_i = 0; ar2_i < n; ar2_i++){
            ar2[ar2_i] = in.nextInt();
        }
        int result = twinArrays(ar1, ar2);
        System.out.println(result);
    }
}
