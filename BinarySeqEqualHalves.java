# Binary Sequence with equal sum of 1st half and 2nd half

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void BinarySeq(int start, int end, int diff, char[] array){
		if(Math.abs(diff) > (end-start+1)/2){
			return;
		}
		if(start > end && diff == 0){
			System.out.println(Arrays.toString(array));
			return;
		}
		array[start] = '0';
		array[end] = '1';
		BinarySeq(start+1, end-1, diff+1, array);
		array[start] = '0';
		array[end] = '0';
		BinarySeq(start+1, end-1, diff, array);
		array[start] = '1';
		array[end] = '1';
		BinarySeq(start+1, end-1, diff, array);
		array[start] = '1';
		array[end] = '0';
		BinarySeq(start+1, end-1, diff-1, array);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = 2;
		char[] array = new char[2*n];
		BinarySeq(0, 2*n-1, 0, array);
	}
}