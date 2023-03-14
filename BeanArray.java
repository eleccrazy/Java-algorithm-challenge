/**
 * 3. An array is defined to be a Bean array if it meets the following
 * conditions
 * 7a. If it contains a 9 then it also contains a 13.
 * b. If it contains a 7 then it does not contain a 16.
 * So {1, 2, 3, 9, 6, 13} and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and
 * {3, 6, 9, 5, 7, 13, 6, 17} are
 * Bean arrays. The following arrays are not Bean arrays:
 * a. { 9, 6, 18} (contains a 9 but no 13)
 * b. {4, 7, 16} (contains both a 7 and a 16)
 * Write a function named isBean that returns 1 if its array argument is a Bean
 * array, otherwise it returns
 * 0.
 * If you are programming in Java or C#, the function signature is
 * int isBean (int[ ] a)
 * If you are programming in C or C++, the function signature is
 * int isBean (int a[ ], int len) where len is the number of elements in the
 * array.
 */
public class BeanArray {

    static int isBean(int[] a) {
        int len = a.length;
        boolean flag13 = false;
        for (int i = 0; i < len; i++) {
            if (a[i] == 9) {
                for (int j = 0; j < len; j++) {
                    if (a[j] == 13)
                        flag13 = true;
                }
                if (!flag13)
                    return 0;
            }
            if (a[i] == 7) {
                for (int j = 0; j < len; j++) {
                    if (a[j] == 16)
                        return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isBean(new int[] { 1, 2, 3, 9, 6, 13 })); // 1
        System.out.println(isBean(new int[] { 3, 4, 6, 7, 13, 15 })); // 1
        System.out.println(isBean(new int[] { 1, 2, 3, 4, 10, 11, 12 })); // 1
        System.out.println(isBean(new int[] { 3, 6, 9, 5, 7, 13, 6, 17 })); // 1
        System.out.println(isBean(new int[] { 9, 6, 18 })); // 0
        System.out.println(isBean(new int[] { 4, 7, 16 })); // 0
    }
}