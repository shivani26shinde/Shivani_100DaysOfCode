// Insertion Sort - Part 1

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSortOne {
    
    public static void insertIntoSorted(int[] ar) {
        int temp = ar[ar.length - 1];
        int i=ar.length-2;
        while(i>=0){
            if(temp<ar[i]){
                ar[i+1] = ar[i];
                printArray(ar);
            }
            else{
                break;
            }
            i--;
        }
        ar[i+1] = temp;
        printArray(ar);
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
