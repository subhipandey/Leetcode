package Find_the_Number_of_Ways_to_Place_People_two;

public class Main {
    public int main(int[][] points) {
        int n = points.length;
        int count = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue; // Skip if same point

                if (points[i][0] <= points[j][0] && points[i][1] >= points[j][1]) {
                    boolean valid = true;

                    for (int k = 0; k < n; k++) {
                        if (k == i || k == j) continue;

                        if (points[k][0] >= points[i][0] && points[k][0] <= points[j][0] &&
                                points[k][1] >= points[j][1] && points[k][1] <= points[i][1]) {
                            valid = false;
                            break;
                        }
                    }

                    if (valid) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
