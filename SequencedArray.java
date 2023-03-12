/**
 * 3. Define an m-n sequenced array to be an array that contains one or more
 * occurrences of all the integers between m and n inclusive.
 * Furthermore, the array must be in ascending order and contain only those
 * integers. For example, {2, 2, 3, 4, 4, 4, 5} is a 2-5 sequenced
 * array. The array {2, 2, 3, 5, 5, 5} is not a 2-5 sequenced array because it
 * is missing a 4. The array {0, 2, 2, 3, 3} is not a 2-3 sequenced
 * array because the 0 is out of range. And {1,1, 3, 2, 2, 4} is not a 1-4
 * sequenced array because it is not in ascending order.
 * Write a method named isSequencedArray that returns 1 if its argument is a m-n
 * sequenced array, otherwise it returns 0.
 * If you are writing in Java or C# the function signature is
 * int isSequencedArray(int[ ] a, int m, int n)
 * If you are writing in C or C++ the function signature is
 * int isSequencedArray(int a[ ], int len, int m, int n) where len is the number
 * of elements in the array a.
 * You may assume that m<=n
 */

public class SequencedArray {
    public static int isSequencedArray(int[] a, int m, int n) {
        int firstElement = a[0];
        if (firstElement < m || firstElement > n) {
            return 0;
        }
        boolean flag;
        for (int i = m; i <= n; i++) {
            flag = false;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    flag = true;
                }
            }
            if (!flag) {
                return 0;
            }
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] < m || a[i] > n || a[i] < a[i - 1]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSequencedArray(new int[] { 2, 2, 3, 4, 4, 4, 5 }, 2, 5)); // 1
        System.out.println(isSequencedArray(new int[] { 2, 2, 3, 5, 5, 5 }, 2, 4)); // 0
        System.out.println(isSequencedArray(new int[] { 0, 2, 2, 3, 3 }, 2, 3)); // 0
        System.out.println(isSequencedArray(new int[] { 1, 1, 3, 2, 2, 4 }, 1, 4)); // 0
        System.out.println(isSequencedArray(new int[] { 1, 2, 3, 4, 5 }, 1, 5)); // 1
        System.out.println(isSequencedArray(new int[] { 1, 3, 4, 2, 5 }, 1, 5)); // 0
        System.out.println(isSequencedArray(new int[] { -5, -5, -4, -4, -4, -3, -3, -2, -2, -2 }, -5, -2)); // 1
        System.out.println(isSequencedArray(new int[] { 0, 1, 2, 3, 4, 5 }, 1, 5)); // 0
        System.out.println(isSequencedArray(new int[] { 1, 2, 3, 4 }, 1, 5)); // 0
        System.out.println(isSequencedArray(new int[] { 1, 2, 5 }, 1, 5)); // 0
        System.out.println(isSequencedArray(new int[] { 5, 4, 3, 2, 1 }, 1, 5)); // 0
    }
}