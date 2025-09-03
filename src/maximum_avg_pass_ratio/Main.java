package maximum_avg_pass_ratio;

import java.util.PriorityQueue;

public class Main {
    public static double main(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) ->
                Double.compare((b[0] + 1) / (b[1] + 1) - b[0] / b[1],
                        (a[0] + 1) / (a[1] + 1) - a[0] / a[1]));

        for (int[] c : classes) {
            pq.offer(new double[]{c[0], c[1]});
        }

        for (int i = 0; i < extraStudents; i++) {
            double[] curr = pq.poll();
            curr[0] += 1;
            curr[1] += 1;
            pq.offer(curr);
        }

        // Calculate the average pass ratio
        double sum = 0.0;
        while (!pq.isEmpty()) {
            double[] curr = pq.poll();
            sum += curr[0] / curr[1];
        }

        return sum / classes.length;
    }
}
