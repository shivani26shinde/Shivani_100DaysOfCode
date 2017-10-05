// QHEAP1

import java.io.*;
import java.util.*;

public class Solution {
    static Queue<Integer> queue = new PriorityQueue<>();
    public static void main(String[] args) {
        int val;
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        for(int i=0;i<lines;i++){
            int start = sc.nextInt();
            if(start == 1){
                val = sc.nextInt();
                queue.add(val);
            }
            else if(start == 2){
                val = sc.nextInt();
                queue.remove(val);
            }
            else{
                System.out.println(queue.peek());
            }
        }
    }
}