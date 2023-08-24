package number_of_recent_calls;
import java.util.LinkedList;
import java.util.Queue;

class RecentCounter1 {
    Queue<Integer> queue;

    public RecentCounter1() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }

    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        int param_1 = obj.ping(1);
        System.out.println(param_1);
    }
}
