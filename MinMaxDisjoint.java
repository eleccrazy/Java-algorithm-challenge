/**
 * 3. An array is defined to be minmax-disjoint if the following conditions
 * hold:
 * a. The minimum and maximum values of the array are not equal.
 * b. The minimum and maximum values of the array are not adjacent to one
 * another.
 * c. The minimum value occurs exactly once in the array.
 * d. The maximum value occurs exactly once in the array.
 * For example the array {5, 4, 1, 3, 2} is minmax-disjoint because
 * a. The maximum value is 5 and the minimum value is 1 and they are not equal.
 * b. 5 and 1 are not adjacent to one another
 * c. 5 occurs exactly once in the array
 * d. 2 occurs exactly once in the array
 * Write a function named isMinMaxDisjoint that returns 1 if its array argument
 * is minmax-disjoint, otherwise it returns 0.If you are programming in Java or
 * C#, the function signature is
 * int isMinMaxDisjoint(int[ ] a)
 * If you are programming in C or C#, the function signature is
 * int isMinMaxDisjoint(int a[ ], int len) where len is the number of elements
 * in the array.
 */

public class MinMaxDisjoint {

    public static int isMinMaxDisjoint(int[] a) {
        int len = a.length, max, min, countMax = 0, countMin = 0;
        if (len <= 2) {
            return 0;
        }
        max = min = a[0];
        for (int i = 1; i < len; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        if (max == min) {
            return 0;
        }
        for (int i = 0; i < len; i++) {
            if (max == a[i]) {
                countMax++;
            }
            if (min == a[i]) {
                countMin++;
            }
            if (countMin > 1 || countMax > 1) {
                return 0;
            }
        }
        for (int i = 0; i < len; i++) {
            if (i < len - 1) {
                if ((a[i] == max && a[i + 1] == min) || (a[i] == min && a[i + 1] == max)) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMinMaxDisjoint(new int[] { 5, 4, 1, 3, 2 }));
        System.out.println(isMinMaxDisjoint(new int[] { 18, -1, 3, 4, 0 }));
        System.out.println(isMinMaxDisjoint(new int[] { 9, 0, 5, 9 }));
        System.out.println(isMinMaxDisjoint(new int[] { 0, 5, 18, 0, 9 }));
        System.out.println(isMinMaxDisjoint(new int[] { 7, 7, 7, 7 }));
        System.out.println(isMinMaxDisjoint(new int[] {}));
        System.out.println(isMinMaxDisjoint(new int[] { 1, 2 }));
        System.out.println(isMinMaxDisjoint(new int[] { 1 }));
    }
}