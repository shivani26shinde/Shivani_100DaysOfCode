// Truck tour (circular)

import java.io.*;
import java.util.*;

public class TruckTour {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] amount = new int[N];
        int[] distance = new int[N];
        for(int i=0;i<N;i++){
            amount[i] = sc.nextInt();
            distance[i] = sc.nextInt();
        }
        int ans = Calculate(amount, distance, N);
        System.out.println(ans);
    }
    public static int Calculate(int[] amount, int[] distance, int N){
        int start = 0;
        int end = 1;
        int total = amount[start] - distance[start];
        while(start != end || total < 0){
            while(start != end && total < 0){
                total = total - (amount[start] - distance[start]);
                start = (start+1)%N;
                if(start == 0){
                    return -1;
                }
            }
            total = total + (amount[end] - distance[end]);
            end = (end+1)%N;
        }
        return start;
    }
}