# Atoi -- Iterative

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static boolean flag = false;
	public static int Atoi(String s){
		if(s.charAt(0) == '-'){
			flag = true;
		}
		int val = 0;
		for(int i=s.length()-1;i>=0;i--){
			if(i==0 && flag == true){
				break;
			}
			val = val+(int)(Character.getNumericValue(s.charAt(i))*Math.pow(10, s.length()-i-1));
		}
		if(flag == true){
			return -val;
		}
		return val;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("-41234");
	}
}