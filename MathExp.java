// Arithematic Expressions (Incomplete)

import java.io.*;
import java.util.*;

public class MathExp {

    static ArrayList<Integer> finalList = new ArrayList<>();
    static ArrayList<Integer> initialList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            initialList.add(sc.nextInt());
        }
        //System.out.println(Arrays.toString(initialList.toArray()));
        Recur(1, initialList.get(0), 1, new ArrayList<Integer>());
        System.out.println(Arrays.toString(finalList.toArray()));
    }
    public static void Recur(int start, int val, int elm, ArrayList<Integer> list){ 
        System.out.println("VAL "+val+"  "+elm);
        if(elm == initialList.size()-1){
            if(val%101 == 0){
                finalList = list;
            }
            return;
        }
        for(int i=start;i<=3;i++){
            if(start == 1){
                val = val * initialList.get(elm);
                list.add(1);
            }
            if(start == 2){
                val = val + initialList.get(elm);
                list.add(2);
            }
            if(start == 3){
                val = val + initialList.get(elm);
                list.add(3);
            }
            Recur(i, val, elm+1, list);
            list.remove(list.size()-1);
        }
    }
}