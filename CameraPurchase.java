//Camera Purchase

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CameraPurchase {
    
    static HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] brands = new int[n];
        for(int brands_i = 0; brands_i < n; brands_i++){
            brands[brands_i] = in.nextInt();
        }
        int[] prices = new int[n];
        for(int prices_i = 0; prices_i < n; prices_i++){
            prices[prices_i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(brands[i])){
                ArrayList<Integer> list = map.get(brands[i]);
                list.add(prices[i]);
                map.put(brands[i], list);
            }
            else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(prices[i]);
                map.put(brands[i], list);
            }
        }
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int d = in.nextInt();
            int[] cameras = new int[d];
            for(int cameras_i = 0; cameras_i < d; cameras_i++){
                cameras[cameras_i] = in.nextInt();
            }
            int k = in.nextInt();
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for(int i=0;i<d;i++){
                if(map.containsKey(cameras[i])){
                    ArrayList<Integer> list = map.get(cameras[i]);
                    queue.addAll(list);
                }
            }
            int j=1;
            while(!queue.isEmpty() && j<k){
                queue.poll();
                j++;
            }
            if(!queue.isEmpty()){
                int val = queue.poll();
                System.out.println(val);
            }
            else{
               System.out.println(-1);
            }
        }
        in.close();
    }
}
