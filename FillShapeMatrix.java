// Fill in the matrix according to the shape

import java.util.*;
import java.lang.*;
import java.io.*;

class FillShapeMatrix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] array = new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				array[i][j] = sc.nextInt();
			}
		}
		int startRow = (array.length)/2;
		int startCol = (array[0].length)/2;
		Fill(array, startRow, startCol);
		for(int i=0;i<12;i++){
			for(int j=0;j<11;j++){
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void Fill(int[][] array, int row, int col){
		if(row < 0 || col < 0 || row > array.length-1 || col > array[0].length-1){
			return;
		}
		if(array[row][col] == 1){
			return;
		}
		array[row][col] = 1;
		Fill(array, row-1, col);
		Fill(array, row, col-1);
		Fill(array, row+1, col);
		Fill(array, row, col+1);
	}
}