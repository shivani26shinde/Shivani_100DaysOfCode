# Arranging Coins

public class Solution {
    public int arrangeCoins(int n) {
        int r = 0;
        int c = 1;
		
		// Iterate till n is not equal to 0
        while(n>=c){
            n = n-c;
            r++;
            c++;
        }
        return r;
    }
}