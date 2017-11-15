import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LuckyPurchase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String ans = "";
        int num = Integer.MAX_VALUE;
        for(int a0 = 0; a0 < n; a0++){
            String name = in.next();
            int value = in.nextInt();
            boolean not = false;
            ArrayList<Integer> listFour = new ArrayList<>();
            ArrayList<Integer> listSeven = new ArrayList<>();
            while(value!=0){
                int a = value%10;
                value = value/10;
                if(a == 4){
                    listFour.add(4);
                }
                else if(a == 7){
                    listSeven.add(7);
                }
                else{
                    not = true;
                    break;
                }
            }
            if(not == false){
                int size1 = listFour.size();
                int size2 = listSeven.size();
                if(size1 == size2){
                    if(size1 < num){
                        num = size1; 
                        ans = name;
                    }
                }
            }
        }
        if(ans == ""){
            System.out.println("-1");
        }
        else{
            System.out.println(ans);
        }
        in.close();
    }
}
