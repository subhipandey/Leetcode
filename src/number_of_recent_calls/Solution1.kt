package number_of_recent_calls

import java.util.*

class RecentCounter() {
    var q: Queue<Int> = LinkedList<Int>()

    fun ping(t: Int): Int {
        q.add(t)
        while (!q.isEmpty() && q.peek() < t - 3000) {
            q.poll()
        }
        return q.size
    }

    fun main(args: Array<String>) {
        val obj = RecentCounter()
        val param_1 = obj.ping(1)
        println(param_1)
    }
}
