// Tile Stacking (Inefficient)

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TileStackingInefficient {

    static int count = 0;
    static int temp;
    static int tileStackingProblem(int n, int m, int k) {
        temp = k;
        Recur(1, n, m, k, new ArrayList<Integer>());
        return count;
    }
    static void Recur(int start, int n, int m, int k, ArrayList<Integer> list){
        if(k == 0){
            k = temp;
            start++;
        }
        if(list.size() == n){
            count++;
            return;
        }
        for(int i=start;i<=m;i++){
            list.add(i);
            Recur(i, n, m, k-1, list);
            k = temp;
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int result = tileStackingProblem(n, m, k);
        System.out.println(result);
        in.close();
    }
}
