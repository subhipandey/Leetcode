package maximum_number_of_vowel_in_a_substring;

class Solution1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abciiidef";
        int k = 3;
        int result = solution.maxVowels(s, k);
        System.out.println(result);
    }

    public int maxVowels(String s, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        int max = count;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
