package guess_number_higher_or_lower

class Solution125 : GuessGame() {
    fun guessNumber(n: Int): Int {
        var low = 1
        var high = n
        var guess = 0
        while (low <= high) {
            val mid = low + (high - low) / 2
            guess = guess(mid)
            if (guess == 0) {
                return mid
            }
            if (guess == -1) {
                high = mid - 1
            }
            if (guess == 1) {
                low = mid + 1
            }
        }
        return low
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = Solution125()
            println(solution.guessNumber(10))
        }
    }
}

open class GuessGame() {
    private val secretNumber: Int

    init {
        secretNumber = (Math.random() * 10).toInt() + 1
    }

    open fun guess(num: Int): Int {
        return when {
            num == secretNumber -> 0
            num < secretNumber -> -1
            else -> 1
        }
    }
}
