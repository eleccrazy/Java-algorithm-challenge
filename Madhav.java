/**
 * 2. A Madhav array has the following property.
 * a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
 * The length of a Madhav array must be n*(n+1)/2 for some n.
 * Write a method named isMadhavArray that returns 1 if its array argument is a
 * Madhav array,
 * otherwise it returns 0. If you are programming in Java or C# the function
 * signature is
 * int isMadhavArray(int[ ] a)
 * If you are programming in C or C++, the function signature is
 * int isMadhavArray(int a[ ], int len) where len is the number of elements in
 * a.
 */

public class Madhav {

    public static int isMadhavArray(int[] a) {
        int len = a.length;
        int prod = 1;
        boolean flag = false;
        for (int n = 2; prod < len; n++) {
            prod = n * (n + 1) / 2;
            if (prod == len) {
                flag = true;
                break;
            }
        }
        if (flag) {
            int base = a[0];
            int startIndex = 1, endIndex = 2, counter = 1;
            while (endIndex < len) {
                int sum = 0;
                for (int i = startIndex; i <= endIndex; i++) {
                    sum += a[i];
                }
                if (sum != base) {
                    return 0;
                }
                counter++;
                startIndex = endIndex + 1;
                endIndex = startIndex + counter;
            }
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int a[] = { 2, 1, 1 };
        int b[] = { 2, 1, 1, 4, -1, -1 };
        int c[] = { 6, 2, 4, 2, 2, 2, 1, 5, 0, 0 };
        int d[] = { 18, 9, 10, 6, 6, 6 };
        int e[] = { -6, -3, -3, 8, -5, -4 };
        int f[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1 };
        int g[] = { 3, 1, 2, 3, 0 };

        System.out.println(isMadhavArray(a));
        System.out.println(isMadhavArray(b));
        System.out.println(isMadhavArray(c));
        System.out.println(isMadhavArray(d));
        System.out.println(isMadhavArray(e));
        System.out.println(isMadhavArray(f));
        System.out.println(isMadhavArray(g));
    }
}