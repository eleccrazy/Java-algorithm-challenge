/**
 * 2. A Meera array is an array that contains the value 0 if and only if it
 * contains a prime number. The
 * array {7, 6, 0, 10, 1} is a Meera array because it contains a prime number
 * (7) and also contains a 0.
 * The array {6, 10, 1} is a Meera array because it contains no prime number and
 * also contains no 0.
 * The array {7, 6, 10} is not a Meera array because it contains a prime number
 * (7) but does not contain
 * a 0. The array {6, 10, 0} is not a Meera array because it contains a 0 but
 * does not contain a prime
 * number.
 * It is okay if a Meera array contains more than one value 0 and more than one
 * prime, so the array {3,
 * 7, 0, 8, 0, 5} is a Meera array (3, 5 and 7 are the primes and there are two
 * zeros.).
 * Write a function named isMeera that returns 1 if its array argument is a
 * Meera array and returns 0
 * otherwise.
 * You may assume the existence of a function named isPrime that returns 1 if
 * its argument is a prime
 * and returns 0 otherwise. You do not have to write isPrime, you can just call
 * it.
 * If you are programming in Java or C#, the function signature is
 * int isMeera(int [ ] a)
 * If you are are programming in C or C++, the function signature is
 * int isMeera(int a[ ], int len) where len is the number of elements in the
 * array.
 */
public class Meera4 {

    static int isPrime(int n) {
        if (n < 2)
            return 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    static int isMeera(int[] a) {
        int len = a.length;
        boolean flag0 = false, flagPrime = false;
        for (int i = 0; i < len; i++) {
            if (a[i] == 0)
                flag0 = true;
            if (isPrime(a[i]) == 1)
                flagPrime = true;
        }
        if ((flag0 && !flagPrime) || (!flag0 && flagPrime))
            return 0;
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMeera(new int[] { 7, 6, 0, 10, 1 })); // 1
        System.out.println(isMeera(new int[] { 6, 10, 1 })); // 1
        System.out.println(isMeera(new int[] { 7, 6, 10 })); // 0
        System.out.println(isMeera(new int[] { 6, 10, 0 })); // 0
        System.out.println(isMeera(new int[] { 3, 7, 0, 8, 0, 5 })); // 1
    }
}