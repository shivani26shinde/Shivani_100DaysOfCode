# Window String

public class Solution {
	public String minWindow(String S, String T) {
	    HashMap<Character, Integer> str = new HashMap<>(    );
	    HashMap<Character, Integer> pat = new HashMap<>();
	    for(int i=0;i<T.length();i++){
	        if(pat.containsKey(T.charAt(i))){
	            int val = pat.get(T.charAt(i));
	            pat.put(T.charAt(i), val+1);
	        }
	        else{
	            pat.put(T.charAt(i), 1);
	        }
	    }
	    int count = 0;
	    int start = 0;
	    int index = -1;
	    int min = Integer.MAX_VALUE;
	    for(int i=0;i<S.length();i++){
	        if(str.containsKey(S.charAt(i))){
	            int val = str.get(S.charAt(i));
	            str.put(S.charAt(i), val+1);
	        }
	        else{
	            str.put(S.charAt(i), 1);
	        }
	        if(pat.containsKey(S.charAt(i)) && str.get(S.charAt(i)) <= pat.get(S.charAt(i))){
	            count++;
	        }
	        if(count == T.length()){
	            while(!pat.containsKey(S.charAt(start)) || (pat.containsKey(S.charAt(start))&&
	                    str.get(S.charAt(start)) > pat.get(S.charAt(start)))){
	                if(pat.containsKey(S.charAt(start)) && str.get(S.charAt(start)) > pat.get(S.charAt(start))){
	                    int val = str.get(S.charAt(start));
	                    str.put(S.charAt(start), val-1);
	                }
	                start++;
	            }
	            int len = i-start+1;
	            if(len<min){
	                min = len;
	                index = start;
	            }
	        }
	    }
	    if(index == -1){
	        return "";
	    }
	    return S.substring(index, index+min);
	}
}
