// Ransom Note

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RansomNote {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
            if(map.containsKey(magazine[magazine_i])){
                int num = map.get(magazine[magazine_i]);
                map.put(magazine[magazine_i], num+1);
            }
            else{
                map.put(magazine[magazine_i], 1);
            }
        }
        String ransom[] = new String[n];
        int value = 1;
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
            if(map.containsKey(ransom[ransom_i])){
                int num = map.get(ransom[ransom_i]);
                if(num == 1){
                    map.remove(ransom[ransom_i]);
                }
                else{
                    map.put(ransom[ransom_i], num-1);
                }
            }
            else{
                value = 0;
                break;
            }
        }
        if(value == 0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
