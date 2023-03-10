/**
 * 2. An array can hold the digits of a number. For example the digits of the
 * number 32053 are
 * stored in the array {3, 2, 0, 5, 3}. Write a method call repsEqual that takes
 * an array and aninteger and returns 1 if the array contains only the digits of
 * the number in the same order that
 * they appear in the number. Otherwise it returns 0.
 * If you are programming in Java or C#, the function prototype is
 * int repsEqual(int[ ] a, int n)
 * If you are programming in C++ or C, the function prototype is
 * int repsEqual(int a[ ], int len, int n) where len is the number of elements
 * in the array.
 * Examples (note: your program must work for all values of a and n, not just
 * those given here!)
 */

public class RepsEqual {

    public static int repsEqual(int[] a, int n) {
        int len = a.length;
        int digit = n % 10;
        int count = 0;
        int leadingZero = 0;
        int checker;
        for (int i = 0; i < len; i++) {
            if (a[i] == 0) {
                leadingZero++;
            } else {
                break;
            }
        }
        checker = len - leadingZero;
        for (int i = len - 1; i >= (0 + leadingZero) && n != 0; i--) {
            if (a[i] == digit) {
                n /= 10;
                digit = n % 10;
            } else {
                return 0;
            }
            count++;
        }

        if ((n == 0 && count < checker) || n != 0) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int a[] = { 3, 2, 0, 5, 3, 4 };
        System.out.println(repsEqual(a, 32053));
    }
}