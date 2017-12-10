# Common Prefix is a list of words

import java.util.*;
import java.lang.*;
import java.io.*;

class CommonPref
{
	public static String CommonPrefix(String s1, String s2){
		String commonprefix = "";
		int i=0;
		int j=0;
		while(i<s1.length() && j<s2.length()){
			if(s1.charAt(i) != s2.charAt(j)){
				break;
			}
			commonprefix = commonprefix + s1.charAt(i);
			i++;
			j++;
		}
		return commonprefix;
	}
	public static String Prefix(ArrayList<String> list){
		String prefix = list.get(0);
		for(int i=1;i<list.size();i++){
			prefix = CommonPrefix(prefix, list.get(i));
		}
		return prefix;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<String> list = new ArrayList<>(Arrays.asList("geeksforgeeks", "geeks", "geek", "geezer"));
		String str = Prefix(list);
		System.out.println(str);
	}
}