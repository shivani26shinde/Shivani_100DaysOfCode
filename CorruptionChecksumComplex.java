// Advent of Code 2017
// Corrupption Checksum - Day 2

import java.util.*;
import java.lang.*;
import java.io.*;

class CorruptionChecksumComplex
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] array = new int[3][4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<16;i++){
			for(int j=0;j<16;j++){
				array[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		for(int i=0;i<16;i++){
			int[] arrayNew = new int[16];
			for(int j=0;j<16;j++){
				arrayNew[j] = array[i][j];
			}
			for(int j=0;j<arrayNew.length-1;j++){
				for(int k=j+1;k<arrayNew.length;k++){
					int val1 = 	arrayNew[j];
					int val2 = 	arrayNew[k];
					if(val1%val2 == 0){
						sum = sum+(val1/val2);
						break;
					}
					if(val2%val1 == 0){
						sum = sum+(val2/val1);
						break;
					}
				}
			}
		}
		System.out.println("Sum is: "+sum);
	}
}