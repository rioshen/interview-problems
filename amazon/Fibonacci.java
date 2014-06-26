/**
 * Problem:
 * How would you add n items in Fibonacci Series
 */
public class Fibonacci {
    /**
     * Solution:
     * Recursion is not practical, I will DP in bottom up approach.
     */
    public static int fibBottomUp(int n) {
        if (n < 0) return -1;
        int[] cache = new int[n + 1];
        cache[0] = 0;
        cache[1] = 1;

        for (int i = 2; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }

        return cache[n];
    }

    public static void main(String[] args) {
        System.out.println(fibBottomUp(3));
    }
}
