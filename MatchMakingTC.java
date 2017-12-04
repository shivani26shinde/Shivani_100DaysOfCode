# MatchMaking  Single Round Match 203 Round 1 - Division I, Level One/Single Round Match 203 Round 1 - Division II, Level Two

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<String> women = new ArrayList<String>(Arrays.asList("Constance", "Alice", "Bertha", "Delilah", "Emily"));
		ArrayList<String> men = new ArrayList<String>(Arrays.asList("Ed", "Duff", "Chip", "Abe", "Biff"));
		ArrayList<String> womenP = new ArrayList<String>(Arrays.asList("baabaa", "ababab", "aaabbb", "bababa", "baabba"));
		ArrayList<String> menP = new ArrayList<String>(Arrays.asList("aabaab", "babbab", "bbbaaa", "abbbba", "abaaba"));
		
		HashMap<String, String> Wo = new HashMap<>();
		HashMap<String, String> Men = new HashMap<>();
		
		for(int i=0;i<women.size();i++){
			Wo.put(women.get(i), womenP.get(i));
		}
		for(int i=0;i<men.size();i++){
			Men.put(men.get(i), menP.get(i));
		}
		Collections.sort(women);
		Collections.sort(men);
		
		HashMap<String, String> match = new HashMap<>();
		for(int i=0;i<women.size();i++){
			int max = Integer.MIN_VALUE;
			int w = i;
			int m = Integer.MIN_VALUE;
			String temp1 = Wo.get(women.get(i));
			for(int j=0;j<men.size();j++){
				if(Men.containsKey(men.get(j))){
					int count = 0;
					String temp2 = Men.get(men.get(j));
					for(int k=0;k<temp1.length();k++){
						if(temp1.charAt(k) == temp2.charAt(k)){
							count++;
						}
					}
					if(count > max ){
						max = count;
						m = j;
					}
				}
			}
			match.put(women.get(w), men.get(m));
			Wo.remove(women.get(w));
			Men.remove(men.get(m));
		}
		for(String key : match.keySet()){
			System.out.println(key+"   "+match.get(key));
		}
	}
}