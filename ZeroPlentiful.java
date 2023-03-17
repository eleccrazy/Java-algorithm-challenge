/**
 * 1. An array is zero-plentiful if it contains at least one 0 and every
 * sequence of 0s is of length at least 4.
 * Write a method named isZeroPlentiful which returns the number of zero
 * sequences if its array argument is zero-plentiful, otherwise it
 * returns 0.
 * If you are programming in Java or C#, the function signature is
 * int isZeroPlentiful(int[ ] a)If you are programming in C or C++, the function
 * signature is
 * int isZeroPlentiful(int a[ ], int len) where len is the number of elements in
 * the array a.
 */
public class ZeroPlentiful {
    static int isZeroPlentiful(int[] a) {
        int len = a.length;
        int count = 0, zeroCount;
        for (int i = 0; i < len; i++) {
            zeroCount = 0;
            if (a[i] == 0) {
                int j = i;
                for (; j < len; j++) {
                    if (a[j] == 0) {
                        zeroCount++;
                    } else {
                        break;
                    }
                }
                if (zeroCount < 4) {
                    return 0;
                }
                count++;
                i = j;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isZeroPlentiful(new int[] { 0, 0, 0, 0, 0 })); // 1
        System.out.println(isZeroPlentiful(new int[] { 1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12 })); // 2
        System.out.println(isZeroPlentiful(new int[] { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0 })); // 3
        System.out.println(isZeroPlentiful(new int[] { 1, 2, 3, 4 })); // 0
        System.out.println(isZeroPlentiful(new int[] { 1, 0, 0, 0, 2, 0, 0, 0, 0 })); // 0
        System.out.println(isZeroPlentiful(new int[] { 0 })); // 0
        System.out.println(isZeroPlentiful(new int[] {})); // 0
    }
}