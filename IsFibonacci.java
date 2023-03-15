/**
 * 1. A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21,….
 * Note that first two
 * Fibonacci numbers are 1 and any Fibonacci number other than the first two is
 * the sum of the previous
 * two Fibonacci numbers. For example, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2 and so
 * on.
 * Write a function named isFibonacci that returns 1 if its integer argument is
 * a Fibonacci number,
 * otherwise it returns 0.
 * The signature of the function is
 * int isFibonacci (int n)
 */

public class IsFibonacci {
    static int isFibonacci(int n) {
        int old = 1, tooOld = 1, current = 1;
        while (current < n) {
            current = old + tooOld;
            if (current == n)
                return 1;
            tooOld = old;
            old = current;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(21)); // 1
        System.out.println(isFibonacci(27)); // 0
        System.out.println(isFibonacci(13)); // 1
        System.out.println(isFibonacci(7)); // 0
    }
}