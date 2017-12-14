# Containers with most water

public class Solution {
	public int maxArea(ArrayList<Integer> a) {
	
		// Single line or no line
	    if(a.size() < 2){
	        return 0;
	    }
	    int left = 0;
	    int right = a.size()-1;
	    int val = 0;
		
		// Iterate till the left and right lines are not the same
	    while(left<right){
			
			// Update the maximum value
	        val = Math.max(val, (right-left)*(Math.min(a.get(left), a.get(right))));
			
			// Left value is smaller than right, move right
	        if(a.get(left) < a.get(right)){
	            left++;
	        }
			// Left value is larger than right, move left
	        else{
	            right--;
	        }
	    }
	    return val;
	}
}
