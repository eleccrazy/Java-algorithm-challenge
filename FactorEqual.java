/**
 * Two integers are defined to be factor equal, if they have the same number of
 * factors. For example,
 * integers 10 and 33 are factor equal because, 10 has four factors: 1, 2, 5, 10
 * and 33 also has four
 * factors: 1, 3, 11, 33. On the other hand, 9 and 10 are not factor equal since
 * 9 has only three factors:
 * 1, 3, 9 and 10 has four factors: 1, 2, 5, 10.
 * Write a function named factorEqual(int n, int m) that returns 1 if n and m
 * are factor equal and 0
 * otherwise.
 * The signature of the function is
 * int factorEqual(int n, int m)
 */

public class FactorEqual {
    static int factorEqual(int n, int m) {
        int nFactor = 2, mFactor = 2;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                nFactor++;
        }
        for (int i = 2; i <= m / 2; i++) {
            if (m % i == 0)
                mFactor++;
        }
        if (nFactor == mFactor)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(factorEqual(10, 33)); // 1
        System.out.println(factorEqual(9, 10)); // 0
    }
}