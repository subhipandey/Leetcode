package find_the_difference_of_two_arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer> array1 = new HashSet<>();
        HashSet<Integer> array2 = new HashSet<>();
        for (int num : nums1) array1.add(num);
        for (int num : nums2) array2.add(num);
        for (int num : nums1) {
            if (array2.contains(num)) {
                array1.remove(num);
                array2.remove(num);
            }
        }
        list.add(new ArrayList<>(array1));
        list.add(new ArrayList<>(array2));
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        List<List<Integer>> result = solution.findDifference(nums1, nums2);
        System.out.println(result);
    }
}
