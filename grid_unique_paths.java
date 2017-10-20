# Grid Unique Paths

public class Solution {
	public int uniquePaths(int a, int b) {
	   # One grid 
	   if(a==1 && b==1){
	       return 1;
	   } 
	   # 1D grids (horizontal)
	   if(a==1){
	       return uniquePaths(a, b-1);
	   }
	   # 1D grids (vertical)
	   if(b==1){
	       return uniquePaths(a-1, b);
	   }
	   # Recursion on 2D grids
	   return uniquePaths(a-1, b) + uniquePaths(a, b-1);
	}
}
