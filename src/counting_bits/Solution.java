package counting_bits;

class Solution {
    public int[] countBits(int n) {
        int[] counts = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                counts[i] = counts[i / 2];
            } else {
                counts[i] = counts[i / 2] + 1;
            }
        }

        return counts;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        int[] result = solution.countBits(n);
        System.out.println("Result: " + java.util.Arrays.toString(result));
    }
}
