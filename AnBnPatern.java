import java.util.*;
import java.lang.*;
import java.io.*;

class CheckPattern
{
	public static boolean isAnBn(String s){
		int l = s.length();
		
		// Only even length strings will have same number of a's and b's
		if(l%2 == 1){
			return false;
		}
		// Set two pointers, one from the left and another from right
		int i = 0;
		int j = l-1;
		
		// Compare the characters till the center
		while(i<j){
			if(s.charAt(i) != 'a' || s.charAt(j) != 'b'){
				return false;
			}
			i++;
			j--;
		}
		return true;	
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "abab";
		
		// Function call
		boolean value = isAnBn(s);
		if(value == true){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}