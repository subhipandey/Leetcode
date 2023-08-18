package determine_if_two_string_are_close;

import java.util.Arrays;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        int[] count1 = new int[26], count2 = new int[26], exist1 = new int[26], exist2 = new int[26];
        for (int i = 0; i < word1.length(); ++i) {
            count1[word1.charAt(i) - 'a']++;
            count2[word2.charAt(i) - 'a']++;
            exist1[word1.charAt(i) - 'a'] = 1;
            exist2[word2.charAt(i) - 'a'] = 1;
        }
        Arrays.sort(count1);
        Arrays.sort(count2);
        return Arrays.equals(count1, count2) && Arrays.equals(exist1, exist2);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.closeStrings("abc", "bca"));
        System.out.println(sol.closeStrings("a", "aa"));
    }
}
