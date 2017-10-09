// Decrease a number to 0 in minimum steps (incomplete) 

import java.util.*;
import java.lang.*;
import java.io.*;

class DownToZero
{
	static HashMap<Integer, Integer> map = new HashMap<>();
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt();
		for(int a0 = 0; a0 < Q; a0++){
			int N = in.nextInt();
			int ans = Calculate(N);
			System.out.println(ans);
		}
	}
	public static int Calculate(int N){
		if(N==0){
			return 0;
		}
		if(N == -1){
			return Integer.MAX_VALUE;
		}
		if(map.containsKey(N)){
			return map.get(N);
		}
		int ans = 1 + Math.min(Calculate(Fact(N)), Calculate(N-1));
		map.put(N, ans);
		return ans;
	} 
	public static int Fact(int N){
		int val1 = (int) Math.sqrt(N);
		int val2 = -1;
		for(int i=val1;i>1;i--){
			if(N%i == 0){
			val2 = N/i;
			break;
			}
		}
		return val2;
	}
}