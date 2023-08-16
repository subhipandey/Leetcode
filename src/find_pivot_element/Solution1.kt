package find_pivot_element

class Solution1 {
    fun pivotIndex(nums: IntArray): Int {
        val totalSum = nums.sum()
        var leftSum = 0
        for (i in nums.indices) {
            if (leftSum == totalSum - leftSum - nums[i]) return i
            leftSum += nums[i]
        }
        return -1
    }
}

fun main() {
    val sol = Solution1()
    val nums1 = intArrayOf(1,7,3,6,5,6)
    val nums2 = intArrayOf(1,2,3)
    val nums3 = intArrayOf(2,1,-1)
    println(sol.pivotIndex(nums1)) // 3
    println(sol.pivotIndex(nums2)) // -1
    println(sol.pivotIndex(nums3)) // 0
}
