# Inserting m into n

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static int Number(int n, int m, int i, int j){
		int x = 0;
		StringBuilder sb = new StringBuilder(); 
		while(x != i){
			sb.append((n&1));
			n = n>>1;
			x++;
		}
		while(x != j+1){
			sb.append((m&1));
			m = m>>1;
			n = n>>1;
			x++;
		}
		while(n != 0){
			sb.append((n&1));
			n = n>>1;
		}
		String s = sb.reverse().toString();
		int num = Integer.parseInt(s,2);
		return num;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(Number(5, 3, 1, 2));
	}
}