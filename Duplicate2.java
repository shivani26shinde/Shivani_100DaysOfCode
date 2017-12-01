# Contains duplicate 2

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
	
		// Single or no value
        if(nums.length < 2){
            return false;
        }
		
		// Use map to store the value and its position
        HashMap<Integer, Integer> map = new HashMap<>();
		
		// Iterate till the end
        for(int i=0;i<nums.length;i++){
		
			// Check if the value exists in map
            if(map.containsKey(nums[i])){
                int j = map.get(nums[i]);
                int diff = Math.abs(i-j);
                if(diff <= k){
                    return true;
                }
            }
			// Add/update the value in the map
            map.put(nums[i], i);
        }
        return false;
    }
}