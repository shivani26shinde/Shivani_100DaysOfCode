// Running median (working and efficient solution using min and max heaps/priorityQueues)

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RunningMedianEfficient {
    static Queue<Integer> min = new PriorityQueue<>();
    static Queue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numOne = 0;
        int numTwo = 0;
        Double valOne = 0.0;
        Double valTwo = 0.0;
        Double val = 0.0;
        int sizeMin = 0;
        int sizeMax = 0;
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            if(i == 0){
                numOne = sc.nextInt();
                System.out.println(numOne);
            }
            else if(i == 1){
                numTwo = sc.nextInt();
                if(numOne < numTwo){
                    max.add(numOne);
                    min.add(numTwo);
                }
                else{
                    max.add(numTwo);
                    min.add(numOne);
                }
                valOne = 1.0*min.peek();
                valTwo = 1.0*max.peek();
                val = (valOne + valTwo)/2;
                System.out.println(val);
            }
            else{
                numTwo = sc.nextInt();
                if(numTwo < max.peek()){
                    max.add(numTwo);
                }
                else{
                    min.add(numTwo);
                }
                sizeMin = min.size();
                sizeMax = max.size();
                if(sizeMax == sizeMin){
                    valOne = 1.0*min.peek();
                    valTwo = 1.0*max.peek();
                    val = (valOne + valTwo)/2;
                    System.out.println(val);
                }
                else{
                    if(sizeMax - sizeMin == 1){
                        val = 1.0*max.peek();
                        System.out.println(val);
                    }
                    else if(sizeMin - sizeMax == 1){
                        val = 1.0*min.peek();
                        System.out.println(val);
                    }
                    else if(sizeMax - sizeMin > 1){
                        min.add(max.poll());
                        valOne = 1.0*min.peek();
                        valTwo = 1.0*max.peek();
                        val = (valOne + valTwo)/2;
                        System.out.println(val);
                    }
                    else{
                        max.add(min.poll());
                        valOne = 1.0*min.peek();
                        valTwo = 1.0*max.peek();
                        val = (valOne + valTwo)/2;
                        System.out.println(val);
                    }
                }
            }
        }
    }
}
