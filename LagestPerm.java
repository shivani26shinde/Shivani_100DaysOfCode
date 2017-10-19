// Largest Permutation Incomplete (Greedy)

import java.io.*;
import java.util.*;

public class LagestPerm {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        for(int i=0;i<N;i++){
            int val = sc.nextInt();
            list.add(val);
            queue.add(val);
        }
        int i=0;
        int j=0;
        while(i<K && j<list.size()){
            int val = queue.poll();
            int index = list.indexOf(val);
            if(j < index){
                int temp = list.get(j);
                list.set(j, val);
                list.set(index, temp);
            }
            i++;
            j++;
        }
        for(int k=0;k<list.size();k++){
            System.out.print(list.get(k)+" ");
        }
    }
}