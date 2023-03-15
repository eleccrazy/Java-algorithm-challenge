/**
 * 2. A Daphne array is defined to be an array that contains at least one odd
 * number and begins and
 * ends with the same number of even numbers.
 * So {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6} is a Daphne array because it
 * begins with three even
 * numbers and ends with three even numbers and it contains at least one odd
 * number
 * The array {2, 4, 6, 8, 6} is not a Daphne array because it does not contain
 * an odd number.
 * The array {2, 8, 7, 10, -4, 6} is not a Daphne array because it begins with
 * two even numbers but ends
 * with three even numbers.
 * Write a function named isDaphne that returns 1 if its array argument is a
 * Daphne array. Otherwise, it
 * returns 0.
 * If you are writing in Java or C#, the function signature is
 * int isDaphne (int[ ] a)
 * If you are writing in C or C++, the function signature is
 * int isDaphne (int a[ ], int len) where len is the number of elements in the
 * array.
 */

public class DaphneArray {
    static int isDaphne(int[] a) {
        int len = a.length, leftCounter = 0, rightCounter = 0;
        boolean exists = false;
        for (int i = 0; i < len; i++) {
            if (a[i] % 2 != 0)
                exists = true;
        }
        if (exists) {
            for (int i = 0; i < len; i++) {
                if (a[i] % 2 == 0)
                    leftCounter++;
                else
                    break;
            }
            for (int i = len - 1; i >= 0; i--) {
                if (a[i] % 2 == 0)
                    rightCounter++;
                else
                    break;
            }
            if (leftCounter == rightCounter)
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isDaphne(new int[] { 4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6 })); // 1
        System.out.println(isDaphne(new int[] { 2, 4, 6, 8, 6 })); // 0
        System.out.println(isDaphne(new int[] { 2, 8, 7, 10, -4, 6 })); // 0
    }
}