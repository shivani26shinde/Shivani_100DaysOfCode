# Order of People heights -- Segment tree (TreeMap data structure)

public class Solution {
	public ArrayList<Integer> order(ArrayList<Integer> heights, ArrayList<Integer> infronts) {
	    ArrayList<Integer> list = new ArrayList<>();
	    TreeMap<Integer, Integer> map = new TreeMap<>();
	    for(int i=0;i<heights.size();i++){
	        map.put(heights.get(i), infronts.get(i));
	    }
	    boolean val = false;
	    while(val == false){
	        int height = map.lastKey();
	        int front = map.get(height);
	        map.remove(height);
	        if(list.isEmpty()){
	            list.add(height);
	        }
	        else if(front == 0){
	            list.add(0, height);
	        }
	        else{
	            list.add(front, height);
	        }
	        if(map.isEmpty()){
	            val = true;
	        }
	    }
	    return list;
	}
}
