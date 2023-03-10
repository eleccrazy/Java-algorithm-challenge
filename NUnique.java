/**
 * 3. An array is defined to be n-unique if exactly one pair of its elements sum
 * to n. For example, the array {2, 7, 3, 4} is 5-
 * unique because only a[0] and a[2] sum to 5. But the array {2, 3, 3, 7} is not
 * 5-unique because a[0] + a[1] = 5 and a[0] +
 * a[2] = 5.
 * Write a function named isNUnique that returns 1 if its integer array argument
 * is n-unique, otherwise it returns 0. So
 * isNUnique(new int[ ]{2, 7, 3, 4}, 5) should return 1 and
 * isNUnique(new int[] {2, 3, 3, 7}, 5) should return 0.
 * If you are programming in Java or C#, the function signature is
 * int isNUnique(int[ ] a, int n)
 * If you are programming in C or C++, the function signature is
 * int isNUnique(int a[ ], int len, int n) where len is the number of elements
 * in the array.
 */

public class NUnique {

    public static int isNUnique(int[] a, int n) {
        int len = a.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] + a[j] == n) {
                    count++;
                }
            }
        }
        if (count == 1) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int a[] = { 7, 3, 3, 2, 4 };
        int b[] = { 1 };
        System.out.println(isNUnique(a, 6));
        System.out.println(isNUnique(a, 10));
        System.out.println(isNUnique(a, 11));
        System.out.println(isNUnique(a, 8));
        System.out.println(isNUnique(a, 4));
        System.out.println(isNUnique(b, 7));
    }
}