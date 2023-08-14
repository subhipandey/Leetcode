package max_number_of_ksum_pairs;

import java.util.*;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int u = 0;
        for (int n : nums) {
            Integer s = map.get(k - n);
            if (s == null) {
                Integer r = map.get(n);
                if (r == null) {
                    map.put(n, 1);
                } else {
                    map.put(n, r + 1);
                }
            } else {
                if (s == 1) {
                    u++;
                    map.remove(k - n);
                } else {
                    u++;
                    map.put(k - n, s - 1);
                }
            }
        }
        return u;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        int result = solution.maxOperations(nums, k);
        System.out.println(result);
    }
}
