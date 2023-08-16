package find_the_highest_altitude

class Solution1 {
    fun largestAltitude(gain: IntArray): Int {
        var maxAltitude = 0
        var currentAltitude = 0
        for (i in gain.indices) {
            currentAltitude += gain[i]
            maxAltitude = maxOf(maxAltitude, currentAltitude)
        }
        return maxAltitude
    }
}

fun main() {
    val solution = Solution1()
    val gain = intArrayOf(-5, 1, 5, 0, -7)
    val result = solution.largestAltitude(gain)
    println(result)
}
