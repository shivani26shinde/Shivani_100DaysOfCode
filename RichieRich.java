// Richie Rich

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RichieRich {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    static StringBuilder sb1 = new StringBuilder();
    static StringBuilder sb2 = new StringBuilder();
    static String richieRich(String s, int n, int k){
        boolean[] array = new boolean[s.length()];
        for(int i=0;i<s.length();i++){
            array[i] = true;
        }
        int start1 = 0;
        int start2 = 0;
        int val1 = 0;
        int val2 = 0;
        int mid = n/2;
        if(n == 1){
            if(k<1){
                return s;
            }
            else{
                return "9";
            }
        }
        if(n%2 == 1){
            start1 = (n/2)-1;
            start2 = (n/2)+1;
        }
        else{
            start1 = n/2-1;
            start2 = n/2;
        }
        while(start1 >= 0 && start2 < n){
            if(k != 0){
                val1 = Character.getNumericValue(s.charAt(start1));
                val2 = Character.getNumericValue(s.charAt(start2));
                if(val1 == val2){
                    stack1.add(val1);
                    stack2.add(val2);
                }
                else if(val1 > val2){
                    stack1.add(val1);
                    stack2.add(val1);
                    array[start2] = false;
                    k--;
                }
                else if(val1 < val2){
                    stack1.add(val2);
                    stack2.add(val2);
                    array[start1] = false;
                    k--;
                }
                //System.out.println(stack1.peek()+"   "+stack2.peek());
                start1--;
                start2++;
            }
            else{
                break;
            }
        }
        while(start1 >= 0 && start2 < n){
            val1 = Character.getNumericValue(s.charAt(start1));
            val2 = Character.getNumericValue(s.charAt(start2));
            stack1.add(val1);
            stack2.add(val2);
            start1--;
            start2++;
        }
        if(k == 0){
            boolean isTrue = CheckPalindrome();
            if(isTrue != true){
                return "-1";
            }
            else{
                if(n%2 == 1){
                    if(k > 0){
                        sb1.append(9);
                    }
                    else{
                        sb1.append(s.charAt(mid));
                    }
                }
                return (sb1.toString() + sb2.reverse().toString());
            }
        }
        System.out.println(stack1.size()+"   "+k);
        if(k != 0){
           while(!stack1.isEmpty() && !stack2.isEmpty()){
               if(k > 1){
                    sb1.append(9);
                    sb2.append(9);
                    k = k-2;
               }
               else{
                   break;
               }
           }
        }
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            sb1.append(Character.forDigit(stack1.pop(), 10));
            sb2.append(Character.forDigit(stack2.pop(), 10));
        }
        if(n%2 == 1){
            if(k > 0){
                sb1.append(9);
            }
            else{
                sb1.append(s.charAt(mid));
            }
        }
        return (sb1.toString() + sb2.reverse().toString());
    }

    static boolean CheckPalindrome(){
         while(!stack1.isEmpty() && !stack2.isEmpty()){
            if(stack1.peek() != stack2.peek()){
                return false;
            }
            sb1.append(Character.forDigit(stack1.pop(), 10));
            sb2.append(Character.forDigit(stack2.pop(), 10));
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        String result = richieRich(s, n, k);
        System.out.println(result);
    }
}
