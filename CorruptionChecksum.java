// Advent of Code 2017
// Corrupption Checksum

import java.util.*;
import java.lang.*;
import java.io.*;

class CorruptionChecksum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] array = new int[3][4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				array[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		for(int i=0;i<3;i++){
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for(int j=0;j<4;j++){
				if(array[i][j] < min){
					min = array[i][j];
				}
				if(array[i][j] > max){
					max = array[i][j];
				}
			}
			sum = sum + (max - min);
		}
		System.out.println("Sum is: "+sum);
	}
}