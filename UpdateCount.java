import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
public class UpdateCount {
    public static void main(String args[] ) throws Exception {
        HashMap<Character, Integer> count = new HashMap<>();
        HashMap<Integer, Character> count2 = new HashMap<>();
        int num = 1;
        int num2 = 1;
        for(char alpha='a';alpha<='z';alpha++){
            count.put(alpha,num);
            num++;
        }
        for(char alpha='a';alpha<='z';alpha++){
            count2.put(num2,alpha);
            num2++;
        }
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int len = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                if(map.containsKey(c)){
                    int addVal = map.get(c);
                    int getVal = count.get(c);
                    int sum = (getVal + addVal) % 26;
                    char addChar = count2.get(sum);
                    sb.append(addChar);
                    map.put(c, addVal+1);
                }
                else{
                    sb.append(c);
                    map.put(c, 1);
                }
            }
            System.out.println(sb.toString());
        }
    }
}