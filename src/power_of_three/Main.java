package power_of_three;

public class Main {
    public static boolean main(int n) {
        if (n <= 0) {
            return false;
        }
        return 1162261467 % n == 0;
    }
}

