/**
 * 3. An array is called centered-15 if some consecutive sequence of elements of
 * the array sum to
 * 15 and this sequence is preceded and followed by the same number of elements.
 * For example
 * {3, 2, 10, 4, 1, 6, 9} is centered-15 because the sequence 10, 4, 1 sums to
 * 15 and the
 * sequence is preceded by two elements (3, 2) and followed by two
 * elements(6,9).
 * Write a method called isCentered15 that returns 1 if its array argument is
 * centered-15, otherwise
 * it returns 0.
 * If you are programming in Java or C#, the function prototype is
 * int isCentered15(int[ ] a)
 * If you are programming in C++ or C, the function prototype is
 * int isCentered5(int a[ ], int len) where len is the number of elements in the
 * array.
 */

public class Centered15 {

    public static int isCentered15(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = i; j < len; j++) {
                sum += a[j];
                if (sum == 15) {
                    if (i == len - 1 - j) {
                        return 1;
                    }
                } else if (sum > 15) {
                    break;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int a[] = { 3, 2, 10, 4, 1, 6, 9 };
        int b[] = { 2, 10, 4, 1, 6, 9 };
        int c[] = { 3, 2, 10, 4, 1, 6 };
        int d[] = { 1, 1, 8, 3, 1, 1 };
        int e[] = { 9, 15, 6 };
        int f[] = { 1, 1, 2, 2, 1, 1 };
        int g[] = { 1, 1, 15 - 1, -1 };
        System.out.println(isCentered15(a));
        System.out.println(isCentered15(b));
        System.out.println(isCentered15(c));
        System.out.println(isCentered15(d));
        System.out.println(isCentered15(e));
        System.out.println(isCentered15(f));
        System.out.println(isCentered15(g));
    }
}