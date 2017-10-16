// Tile Stacking (Incomplete)

import java.util.*;
import java.lang.*;
import java.io.*;

class TileStacking
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Recur(1,3,3,2, new ArrayList<Integer>());
	}
	static void Recur(int start, int n, int m, int k, ArrayList<Integer> list){
		if(k == 0){
			start++;
		}
		if(list.size() == n){
			System.out.println(Arrays.toString(list.toArray()));
			return;
		}
		for(int i=start;i<=m;i++){
			list.add(i);
			Recur(i, n, m , k-1, list);
			k++;
			list.remove(list.size()-1);
		}
	}
}