# Trailing zeros in factorial

public class Solution {
  
	public int trailingZeroes(int a) {
	    int count = 0;
		# Will keep updating the count till its divisible by 5
	     while(a != 0){
	         count = count + a/5;
	         a = a/5;
	     }
	    return count;
	}
}
