package container_with_most_water;

class Solution {
    public int maxArea(int[] height) {
        int i = 0, ans = 0, breadth = 0, length = 0;
        int j = height.length - 1;

        while (i < j) {
            breadth = j - i;
            length = Math.min(height[i], height[j]);
            ans = Math.max(ans, length * breadth);

            if (height[i] <= height[j])
                i++;
            else
                j--;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxArea(height);
        System.out.println(result);
    }
}

