/**
 * 3. An array is defined to be odd-heavy if it contains at least one odd
 * element and every
 * element whose value is odd is greater than every even-valued element. So {11,
 * 4, 9, 2, 8}
 * is odd-heavy because the two odd elements (11 and 9) are greater than all the
 * even
 * elements. And {11, 4, 9, 2, 3, 10} is not odd-heavy because the even element
 * 10 is greater
 * than the odd element 9.
 * Write a function called isOddHeavy that accepts an integer array and returns
 * 1 if the
 * array is odd-heavy; otherwise it returns 0.
 * If you are programming in Java or C#, the function signature is int
 * isOddHeavy(int[ ] a)
 * If you are programming in C or C++, the function signature is int
 * isOddHeavy(int a[ ], int
 * len) where len is the number of elements in the array
 */

public class OddHeavy {

    public static int isOddHeavy(int[] a) {
        int len = a.length;
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            if (a[i] % 2 == 0) {
                continue;
            }
            for (int j = 0; j < len; j++) {
                if (a[j] % 2 == 0 && a[j] > a[i]) {
                    return 0;
                }
            }
            flag = true;
        }
        if (!flag) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[] { 11, 4, 9, 2, 8 })); // returns 1
        System.out.println(isOddHeavy(new int[] { 11, 4, 9, 2, 3, 10 })); // returns 0
        System.out.println(isOddHeavy(new int[] { 1 })); // returns 1
        System.out.println(isOddHeavy(new int[] { 2 })); // returns 0
        System.out.println(isOddHeavy(new int[] { 1, 1, 1, 1, 1, 1 })); // returns 1
        System.out.println(isOddHeavy(new int[] { 2, 4, 6, 8, 11 })); // returns 1
        System.out.println(isOddHeavy(new int[] { -2, -4, -6, -8, -11 })); // returns 0
    }
}