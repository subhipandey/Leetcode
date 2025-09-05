package minimum_operations_to_Make_the_integer_zero;

public class Main {
    public int main(int num1, int num2) {
        for (int k = 1; k <= 60; k++) {
            long target = (long) num1 - (long) k * num2;
            if (target >= 0 && target <= (1L << 61) - 1) {
                int bitCount = Long.bitCount(target);
                if (bitCount <= k && target >= k) {
                    return k;
                }
            }
        }
        return -1;
    }
}
