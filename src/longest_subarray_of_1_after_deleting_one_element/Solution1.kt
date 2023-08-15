package longest_subarray_of_1_after_deleting_one_element

class Solution1 {
    fun longestSubarray(nums: IntArray): Int {
        var max = 0
        var count = 0
        var prevCount = 0
        var zeroFound = false
        for (i in nums.indices) {
            if (nums[i] == 1) {
                count++
            } else {
                if (zeroFound) {
                    max = max.coerceAtLeast(prevCount + count)
                }
                prevCount = count
                count = 0
                zeroFound = true
            }
        }
        if (zeroFound) {
            max = max.coerceAtLeast(prevCount + count)
        }
        return if (zeroFound) max else 0.coerceAtLeast(count - 1)
    }
}

fun main() {
    val sol = Solution1()
    val nums = intArrayOf(1, 1, 0, 1)
    val result = sol.longestSubarray(nums)
    println(result)
}
