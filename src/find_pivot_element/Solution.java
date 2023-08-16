package find_pivot_element;

class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;

        for(int curr : nums){
            right += curr;
        }

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                right -= nums[i];
                if(left == right){
                    return i;
                }
                continue;
            }

            left += nums[i - 1];
            right -= nums[i];

            if(left == right){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1,7,3,6,5,6};
        int[] nums2 = {1,2,3};
        int[] nums3 = {2,1,-1};
        System.out.println(sol.pivotIndex(nums1)); // 3
        System.out.println(sol.pivotIndex(nums2)); // -1
        System.out.println(sol.pivotIndex(nums3)); // 0
    }
}
