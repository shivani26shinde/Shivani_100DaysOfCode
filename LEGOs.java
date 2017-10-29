import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LEGOs {

    static HashMap<Character, Integer> map = new HashMap<>();
    static int productOfPages(int a, int b, int c, int d, int p, int q) {
        map.put('A', a);
        map.put('B', b);
        map.put('C', c);
        map.put('D', d);
        int num = 1;
        for(Character chc: map.keySet()){
            if(map.get(chc) == p){
                map.remove(chc);
                break;
            }
        }
        for(Character chc: map.keySet()){
            if(map.get(chc) == q){
                map.remove(chc);
                break;
            }
        }
        for(Character chc: map.keySet()){
            num = num * map.get(chc);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int p = in.nextInt();
            int q = in.nextInt();
            int answer = productOfPages(a, b, c, d, p, q);
            System.out.println(answer);
        }
        in.close();
    }
}
