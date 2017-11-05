// Longest substring without repeating characters

import java.util.*;
import java.lang.*;
import java.io.*;

class LongSubstrNoRepeat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int Left = 0;
		int Right = 0;
		int MaxL = 0;
		int MaxR = 0;
		int max = Integer.MIN_VALUE;
		StringBuilder sb = new StringBuilder();
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			Right = i;
			if(map.containsKey(c)){
				int LeftStart = map.get(c);
				if(LeftStart+1 > Left){
					Left = LeftStart+1;
				}
			}
			map.put(c, i);
			int len = Right-Left+1;
			if(max < len){
				max = len;
				MaxL = Left;
				MaxR = Right;
			}
		}
		for(int i=MaxL;i<=MaxR;i++){
			sb.append(s.charAt(i));	
		}
		System.out.println("Maximum length string is: "+sb.toString());
		System.out.println("Maximum length is: "+max);
	}
}