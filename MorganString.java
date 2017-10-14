// Morgan and a String (Incomplete)

import java.io.*;
import java.util.*;

public class MorganString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            StringBuilder sb = new StringBuilder();
            String a = sc.next();
            String b = sc.next();
            int start1 = 0;
            int start2 = 0;
            while(start1 < a.length() && start2 < b.length()){
                if(a.charAt(start1) < b.charAt(start2)){
                    sb.append(a.charAt(start1++));
                }
                if(a.charAt(start1) > b.charAt(start2)){
                    sb.append(b.charAt(start2++));
                }
                else{
                    int newStart1 = start1;
                    int newStart2 = start2;
                    char temp = a.charAt(start1);
                    for(; newStart1 < a.length() && newStart2 < b.length(); newStart1++, newStart2++){
                        if(a.charAt(newStart1) != b.charAt(newStart2)){
                            break;
                        }
                        else if(a.charAt(newStart1) > temp){
                            sb.append(a.substring(start1, newStart1)).append(b.substring(start2, newStart2));
                            start1 = newStart1;
                            start2 = newStart2;
                            temp = a.charAt(newStart1);
                        }
                    }
                    if(newStart1 == a.length()){
                        sb.append(b.charAt(start2));
                        start2++;
                    }
                    else if(newStart2 == b.length()){
                        sb.append(a.charAt(start1));
                        start1++;
                    }
                    else{
                        if(a.charAt(newStart1) < b.charAt(newStart2)){
                            sb.append(a.charAt(start1++));
                        }
                        else{
                            sb.append(b.charAt(start2++));
                        }
                    }
                }
            }
            sb.append(a.substring(start1)).append(b.substring(start2));
            System.out.println(sb.toString());
        }
    }
}