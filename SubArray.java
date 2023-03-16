/**
 * 2. An Sub array is defined to be an array in which each element is greater
 * than sum of all elements
 * after that. See examples below:
 * {13, 6, 3, 2} is a Sub array. Note that 13 > 2 + 3 + 6, 6 > 3 + 2, 3 > 2.
 * {11, 5, 3, 2} is a NOT a Sub array. Note that 5 is not greater than 3 + 2.
 * Write a function named isSub that returns 1 if its array argument is a Sub
 * array, otherwise it returns 0.
 * If you are programming in Java or C#, the function signature is:
 * int isSub (int [ ] a)
 * If you are programming in C or C++, the function signature is:
 * int isSub (int a[ ], int len) where len is the number of elements in the
 * array.
 */
public class SubArray {
    static int isSub(int[] a) {
        int sum = 0;
        int len = a.length;
        for (int i = len - 1; i > 0; i--) {
            sum += a[i];
            if (!(sum < a[i - 1]))
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSub(new int[] { 13, 6, 3, -2 }));
        System.out.println(isSub(new int[] { 11, 5, 3, 2 }));
        System.out.println(isSub(new int[] { 13, 6, 3, 2, 5 }));
    }
}