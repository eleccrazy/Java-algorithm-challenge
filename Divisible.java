/**
 * 2. Write a method named isDivisible that takes an integer array and a divisor
 * and returns 1 if all its elements are divided
 * by the divisor with no remainder. Otherwise it returns 0.
 * If you are programming in Java or C#, the function signature is
 * int isDivisible(int [ ] a, int divisor)
 * If you are programming in C or C++, the function signature is
 * int isDivisible(int a[ ], int len, int divisor) where len is the number of
 * elements in the array.
 */

public class Divisible {

    public static int isDivisible(int[] a, int divisor) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % divisor != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] a = { 3, 3, 6, 36 };
        int[] b = { 4 };
        int[] c = { 3, 4, 3, 6, 36 };
        int[] d = { 6, 12, 24, 36 };
        int[] e = {};

        System.out.println(isDivisible(a, 3));
        System.out.println(isDivisible(b, 2));
        System.out.println(isDivisible(c, 3));
        System.out.println(isDivisible(d, 12));
        System.out.println(isDivisible(e, 5));
    }
}