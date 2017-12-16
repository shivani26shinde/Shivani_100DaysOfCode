// Advent of Code 2017
// Inverse Captcha with more steps to be counted

import java.util.*;
import java.lang.*;
import java.io.*;

class InverseCaptchaMoreSteps
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String temp = "12131415";
		String[] arr = temp.split("");
		int[] array = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			array[i] = Integer.parseInt(arr[i]);
		}
		Stack<Integer> stStore = new Stack<>();
		int startVal = array[0];
		int sum = 0;
		for(int i=0;i<array.length;i++){
			int val = (i+(array.length/2))%array.length;
			if(array[i] == array[val]){
				sum = sum + array[i];
			}
		}
		System.out.println("The sum is: "+sum);
	}
}