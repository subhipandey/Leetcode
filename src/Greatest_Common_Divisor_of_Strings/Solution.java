package Greatest_Common_Divisor_of_Strings;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
            return "";
        return str1.substring(0,gcd(str1.length(),str2.length()));
    }
    public int gcd(int n1, int n2){
        if(n2==0)
            return n1;
        return gcd(n2,n1%n2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str1 = "ABCABC";
        String str2 = "ABC";
        String result = solution.gcdOfStrings(str1, str2);
        System.out.println(result);
    }
}