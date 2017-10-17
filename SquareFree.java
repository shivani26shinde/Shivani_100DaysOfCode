// Square Free numbers (Incomplete)

import java.io.*;
import java.util.*;

public class SquareFree {

    static HashSet<Integer> nonPrime = new HashSet<>();
    static ArrayList<Integer> prime = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        prime.add(1);
        int count=0;
        int num=2;
        while(count!=N) 
        {
            boolean p=true;
            for (int i=2;i<=Math.sqrt(num);i++)
            {
                if (num%i==0)
                {
                    p=false;
                    break;
                }

            }
            if (p)
            {
                count++;
                prime.add(num);
            }
            num++;
        }
        int lastVal = prime.get(prime.size()-1);
        for(int i=1;i<prime.size();i++){
            int elm = prime.get(i);
            int sqr = (int) Math.pow(elm, K);
            if(sqr > N){
                break;
            }
            nonPrime.add(sqr);
            for(int j=elm;j<=lastVal;j++){
                int cal = sqr * j;
                if(cal > N){
                    break;
                }
                nonPrime.add(cal);
            }
        }
        int res = N - nonPrime.size();
        System.out.println(res);
    }
}