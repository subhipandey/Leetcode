package is_subsequence;

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int s_pointer=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(s_pointer)){
                s_pointer++;
                if(s_pointer==s.length()) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abc";
        String t = "ahbgdc";
        boolean result = solution.isSubsequence(s, t);
        System.out.println(result);
    }
}
