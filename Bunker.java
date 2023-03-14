/**
 * 2. A Bunker array is defined to be an array in which at least one odd number
 * is immediately followed
 * by a prime number. So {4, 9, 6, 7, 3} is a Bunker array because the odd
 * number 7 is immediately
 * followed by the prime number 3. But {4, 9, 6, 15, 21} is not a Bunker array
 * because none of the odd
 * numbers are immediately followed by a prime number.
 * Write a function named isBunkerArray that returns 1 if its array argument is
 * a Bunker array,
 * otherwise it returns 0.
 * If you are programming in Java or C#, the function signature is
 * int isBunkerArray(int [ ] a)
 * If you are programming in C or C++, the function signature is
 * int isBunkerArray(int a[ ], int len) where len is the number of elements in
 * the array.
 * You may assume that there exists a function isPrime that returns 1 if it
 * argument is a prime, otherwise
 * it returns 0. You do not have to write this function.
 */
public class Bunker {
    static int isPrime(int n) {
        if (n < 2)
            return 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    static int isBunkerArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 != 0) {
                if (isPrime(a[i + 1]) == 1) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isBunkerArray(new int[] { 4, 9, 6, 7, 3 })); // 1
        System.out.println(isBunkerArray(new int[] { 4, 9, 6, 15, 21 })); // 0
    }
}