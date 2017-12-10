// Construct Arrays

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ConstructArrays {

    static long count = 0;

    static void createArray(int start, int n, int k, int x, ArrayList<Integer> list){
        if(list.size() == n){
            if(list.get(0) == 1 || list.get(list.size()-1) == x){
                return;
            }
            count++;
            return;
        }
        for(int i=start;i<=k;i++){
            list.add(i);
            createArray(i + 1, n, k, x, list);
            list.remove(list.size()-1);
        }
    }
    static long countArray(int n, int k, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        createArray(1, n-2, k, x, list);
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int x = in.nextInt();
        long answer = countArray(n, k, x);
        System.out.println(answer);
        in.close();
    }
}
