package guess_number_higher_or_lower;


class Solution125 extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            if (res == 0)
                return mid;
            else if (res < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution125 solution = new Solution125();
        System.out.println(solution.guessNumber(10));
    }
}

class GuessGame {
    private int secretNumber;

    public GuessGame() {
        secretNumber = (int)(Math.random() * 10) + 1;
    }

    public int guess(int num) {
        if (num == secretNumber)
            return 0;
        else if (num < secretNumber)
            return -1;
        else
            return 1;
    }
}
