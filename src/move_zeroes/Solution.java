package move_zeroes;

class Solution1 {
    public void moveZeroes(int[] nums) {
        int position = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[position] = nums[i];
                position++;
            }
        }

        for(int i=position; i<nums.length; i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
