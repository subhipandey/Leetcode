package max_consecutive_ones_iii

class Solution1 {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var left = 0
        var k = k
        for (right in nums.indices) {
            if (nums[right] == 0) k--
            if (k < 0) {
                if (nums[left] == 0) k++
                left++
            }
        }
        return nums.size - left
    }
}

fun main() {
    val sol = Solution1()
    val nums = intArrayOf(1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0)
    val k = 2
    val result = sol.longestOnes(nums, k)
    println(result)
}
