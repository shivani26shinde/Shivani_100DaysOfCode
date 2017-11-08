// Strong password

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrongPassword {

    static int minimumNumber(int n, String password) {
        HashSet<Character> setCaps = new HashSet<>();
        HashSet<Character> setNonCaps = new HashSet<>();
        HashSet<Character> setSpecial = new HashSet<>(Arrays.asList('!','@','#','$','%','^','&','*','(',')','-','+'));
        HashSet<Character> nums = new HashSet<>();
        for(char ch='A';ch<='Z';ch++){
            setCaps.add(ch);
        }
        for(char ch='a';ch<='z';ch++){
            setNonCaps.add(ch);
        }
        for(int i=0;i<=9;i++){
            nums.add('i');
        }
        int count = 0;
        int set1 = 0;
        int set2 = 0;
        int set3 = 0;
        int set4 = 0;
        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if(set1 == 0 && setCaps.contains(ch)){
                set1 = 1;
                count++;
            }
            else if(set2 == 0 && setNonCaps.contains(ch)){
                set2 = 1;
                count++;
            }
            else if(set3 == 0 && setSpecial.contains(ch)){
                set3 = 1;
                count++;
            }
            else if(set4 == 0 && nums.contains(ch)){
                set4 = 1;
                count++;
            }
        }
        if(count >= 6){
            return 0;
        }
        return 6-count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
