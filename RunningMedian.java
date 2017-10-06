// Running median (Working solution but, very inefficient)

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RunningMedian {
    static Queue<Integer> queue = new PriorityQueue<>();
    public static void main(String args[] ) throws Exception {
        double element = 0;
        double element1 = 0;
        double element2 = 0;
        int val = 0;
        int val1 = 0;
        int val2 = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int value = sc.nextInt();
            queue.add(value);
            int size = queue.size();
            if(size%2 == 1){
                num = 0;
                Iterator itr = queue.iterator();
                while(itr.hasNext() && num < (size/2)+1){
                    num++;
                    val = (Integer)itr.next();
                }
                element = 1.0*val;
                System.out.println(element);
            }
            else{
                num = 0;
                Iterator itr = queue.iterator();
                while(itr.hasNext() && num < size/2){
                    num++;
                    val1 = (Integer)itr.next();
                }
                if(itr.hasNext()){
                    val2 = (Integer)itr.next();
                }   
                element1 = 1.0*val1;
                element2 = 1.0*val2;
                element = (element1+element2)/2;
                System.out.println(element);
            }
        }
    }
}
