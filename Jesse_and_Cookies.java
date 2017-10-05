// Jesse and Cookies

import java.io.*;
import java.util.*;

public class Solution {
    
    static Queue<Integer> queue = new PriorityQueue<>(); 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        for(int i=0;i<N;i++){
            queue.add(sc.nextInt());
        }
        boolean flag = false;
        int ans = 0;
        if(queue.peek() >= K){
            flag = true;
        }
        while(queue.size() >= 2 && queue.peek() < K){
            int val1 = queue.poll();
            int val2 = queue.poll();
            int value = val1 + (2*val2);
            queue.add(value);
            ans++;
            if(queue.peek() >= K){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println(ans);
        }
        else{
            System.out.println(-1);
        }
    }
}