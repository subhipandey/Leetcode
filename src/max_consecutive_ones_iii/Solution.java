package max_consecutive_ones_iii;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right;
        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) k--;
            if (k < 0) {
                if (nums[left] == 0) k++;
                left++;
            }
        }
        return right - left;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int result = sol.longestOnes(nums, k);
        System.out.println(result);
    }
}
