# Distinct numbers in a window

public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int val;
        for(int i=0;i<B;i++){
            if(!map.containsKey(A.get(i))){
                map.put(A.get(i), 1);
            }
            else{
                val = map.get(A.get(i));
                map.put(A.get(i), val+1);
            }
        }
        list.add(map.size());
        for(int i=B;i<A.size();i++){
            val = map.get(A.get(i-B));
            if(val == 1){
                map.remove(A.get(i-B));
            }
            else{
                map.put(A.get(i-B), val-1);
            }
            if(!map.containsKey(A.get(i))){
                map.put(A.get(i), 1);
            }
            else{
                val = map.get(A.get(i));
                map.put(A.get(i), val+1);
            }
            list.add(map.size());
        }
        return list;
    }
}
