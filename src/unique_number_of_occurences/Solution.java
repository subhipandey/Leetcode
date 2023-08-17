package unique_number_of_occurences;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>h=new HashMap();
        for(int i=0;i<arr.length;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer>s = new HashSet();
        for(Integer i: h.keySet()){
            if(s.contains(h.get(i))){
                return false;
            }
            else{
                s.add(h.get(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1,2,2,1,1,3};
        System.out.println(sol.uniqueOccurrences(arr));
    }
}
