/**
 * 3. A Bean array is defined to be an array where for every value n in the
 * array, there is also an
 * element n-1 or n+1 in the array.
 * For example, {2, 10, 9, 3} is a Bean array because
 * 2 = 3-1
 * 10 = 9+1
 * 3=2+1
 * 9 = 10 -1
 * Other Bean arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.
 * The array {3, 4, 5, 7} is not a Bean array because of the value 7 which
 * requires that the array
 * contains either the value 6 (7-1) or 8 (7+1) but neither of these values are
 * in the array.
 * Write a function named isBean that returns 1 if its array argument is a Bean
 * array. Otherwise it
 * returns a 0.
 * If you are programming in Java or C#, the function signature is
 * int isBean(int[ ] a)
 * If you are programming in C or C++, the function signature is
 * int isBean(int a[ ], int len) where len is the number of elements in the
 * array.
 */
public class Bean {
    static int isBean(int[] a) {
        int len = a.length;
        boolean exists;
        for (int i = 0; i < len; i++) {
            exists = false;
            for (int j = 0; j < len; j++) {
                if (a[i] - 1 == a[j] || a[i] + 1 == a[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isBean(new int[] { 2, 10, 9, 3 })); // 1
        System.out.println(isBean(new int[] { 2, 2, 3, 3, 3 }));// 1
        System.out.println(isBean(new int[] { 1, 1, 1, 2, 1, 1 })); // 1
        System.out.println(isBean(new int[] { 0, -1, 1 })); // 1
        System.out.println(isBean(new int[] { 3, 4, 5, 7 })); // 0
    }
}