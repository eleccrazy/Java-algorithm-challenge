/**
 * 3. An isSym (even/odd Symmetric) array is defined to be an array in which
 * even numbers and odd numbers
 * appear in the same order from “both directions”. You can assume array has at
 * least one element. See
 * examples below:
 * {2, 7, 9, 10, 11, 5, 8} is a isSym array.
 * Note that from left to right or right to left we have even, odd, odd, even,
 * odd, odd, even.
 * {9, 8, 7, 13, 14, 17} is a isSym array.
 * Note that from left to right or right to left we have {odd, even, odd, odd,
 * even, odd}.
 * However, {2, 7, 8, 9, 11, 13, 10} is not a isSym array.
 * From left to right we have {even, odd, even, odd, odd, odd, even}.
 * From right to left we have {even, odd, odd, odd, even, odd, even}, whichis
 * not the same.
 * Write a function named isSym that returns 1 if its array argument is a isSym
 * array, otherwise it returns 0.
 * If you are programming in Java or C#, the function signature is:
 * int isSym (int [ ] a)
 * If you are programming in C or C++, the function signature is:
 * int isSym (int a[ ], int len) where len is the number of elements in the
 * array.
 */
public class Symmetric {
    static int isSym(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            if (!((a[i] % 2 == 0 && a[len - 1 - i] % 2 == 0) ||
                    (a[i] % 2 != 0 && a[len - 1 - i] % 2 != 0))) {
                return 0;
            }
            if (i > (len - 1 - i)) {
                break;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSym(new int[] { 2, 7, 9, 10, 11, 5, 8 })); // 1
        System.out.println(isSym(new int[] { 9, 8, 7, 13, 14, 17 })); // 1
        System.out.println(isSym(new int[] { 2, 7, 8, 9, 11, 13, 10 })); // 0
    }
}