// Advent of Code 2017
// Inverse Captcha - Duplicate

import java.util.*;
import java.lang.*;
import java.io.*;

class InverseCaptchaDuplicate
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
		int sum = 0;
		for(int i=1;i<array.length;i++){
			if(array[i] == array[i-1]){
				sum = sum + array[i-1];
			}
		}
		if(startVal == array[n-1]){
			sum = sum + array[n-1];	
		}
		System.out.println("The sum is: "+sum);
	}
}