package container_with_most_water

class Solution1 {
    fun maxArea(height: IntArray): Int {
        var i = 0
        var ans = 0
        var breadth = 0
        var length = 0
        var j = height.size - 1

        while (i < j) {
            breadth = j - i
            length = Math.min(height[i], height[j])
            ans = Math.max(ans, length * breadth)

            if (height[i] <= height[j])
                i++
            else
                j--
        }
        return ans
    }
}

fun main() {
    val solution = Solution1()
    val height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
    val result = solution.maxArea(height)
    println(result)
}
