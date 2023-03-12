/**
 * 1. Write a function named largestPrimeFactor that will return the largest
 * prime factor of a number. If the number is <=1 it should
 * return 0. Recall that a prime number is a number > 1 that is divisible only
 * by 1 and itself, e.g., 13 is prime but 14 is not.
 * The signature of the function is int largestPrimeFactor(int n)
 */

public class PrimeFactor {

    public static int largestPrimeFactor(int n) {
        boolean flag;
        int max = 2;
        if (n < 2) {
            return 0;
        }
        for (int i = 2; i <= n / 2; i++) {
            flag = true;
            if (n % i == 0) {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    max = i;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }
}