// Advent of Code 2017
// Inverse Captcha - No duplicate

import java.util.*;
import java.lang.*;
import java.io.*;

class InverseCaptchaNoDuplicate
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++){
			array[i] = sc.nextInt();
		}
		Stack<Integer> stStore = new Stack<>();
		int startVal = array[0];
		int start = 0;
		int val = 0;
		for(int i=1;i<array.length;i++){
			if(array[i] == array[i-1]){
				if(!stStore.isEmpty() && array[i-1] != stStore.peek()){
					stStore.push(array[i-1]);
				}
				else if(stStore.isEmpty()){
					stStore.push(array[i-1]);	
				}
			}
		}
		if(startVal == array[n-1]){
			if(!stStore.isEmpty() && array[n-1] != stStore.peek()){
				stStore.push(array[n-1]);
			}
			else if(stStore.isEmpty()){
				stStore.push(array[n-1]);	
			}	
		}
		int sum = 0;
		while(!stStore.isEmpty()){
			sum = sum + stStore.pop();
		}
		System.out.println("The sum is: "+sum);
	}
}