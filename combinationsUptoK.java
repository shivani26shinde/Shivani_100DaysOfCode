# Combinations (upto k)

public class Solution {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
	    if(k>n){
	        return list;
	    }
	    Combo(1,k,n,new ArrayList<>());
	    return list;
	}
	public void Combo(int i,int k,int n,ArrayList<Integer> temp){
	    if(k==0){
	        list.add(new ArrayList(temp));
	    }
	    for(int j=i;j<=n;j++){
	        temp.add(j);
	        Combo(j+1,k-1,n,temp);
	        temp.remove(temp.size()-1);
	    }
	}
}
