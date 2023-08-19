package single_number;

public class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        for (int i : nums) {
            x ^= i;
        }
        return x;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 1, 2, 1, 2};
        int result = solution.singleNumber(nums);
        System.out.println(result);
    }
}