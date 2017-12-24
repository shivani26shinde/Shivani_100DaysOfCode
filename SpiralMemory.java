// Advent of Code 2017
// Spiral Memory - Day 3

import java.util.*;
import java.lang.*;
import java.io.*;

class SpiralMemory
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a = 325489;
		int start = 1;
		int end = 1;
		int count = 1;
		int round = 1;
		while(end < a){
			start = end+1;
			end = end + 4*count + 4;
			count = count+2;
			round++;
		}
		
		// Example: In round 3, the start will be 10 and end will be 25
		
		count = count-2;
		int min = round-1;
		int max = 2*(round-1);
		int val = count;
		int flag = 0;
		
		// All the values between start and end will have steps to the center value in the range of (min, max)
		// Example: If the number is 22, min=2 and max=4  as round = 3, and the min steps for 22 are "3"
		
		while(start<=a){
			if(count >= min && flag  == 0){
				val = count;
				count--;
			}
			else if(count <= max && flag == 1){
				val = count;
				count++;
			}
			if(count == (min-1)){
				count=count+2;
				flag = 1;
			}
			if(count == (max+1)){
				count=count-2;
				flag = 0;
			}
			start++;
		}
		System.out.println(val);
	}
}