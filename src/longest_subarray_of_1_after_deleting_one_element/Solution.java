package longest_subarray_of_1_after_deleting_one_element;

class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int count = 0;
        int prevCount = 0;
        boolean zeroFound = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (zeroFound) {
                    max = Math.max(max, prevCount + count);
                }
                prevCount = count;
                count = 0;
                zeroFound = true;
            }
        }
        if (zeroFound) {
            max = Math.max(max, prevCount + count);
        }
        return zeroFound ? max : Math.max(0, count - 1);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 1, 0, 1};
        int result = sol.longestSubarray(nums);
        System.out.println(result);
    }
}
