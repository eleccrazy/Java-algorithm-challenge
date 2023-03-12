/**
 * 2. Define an array to be a 121 array if all its elements are either 1 or 2
 * and it begins with one or more 1s followed by a one or more 2s
 * and then ends with the same number of 1s that it begins with. Write a method
 * named is121Array that returns 1 if its array argument is
 * a 121 array, otherwise, it returns 0.
 * If you are programming in Java or C#, the function signature is
 * int is121Array(int[ ] a)
 * If you are programming in C or C++, the function signature is
 * int is121Array(int a[ ], int len) where len is the number of elements in the
 * array a.
 */

public class Is121Array {
    public static int is121Array(int[] a) {
        int upCount = 1, downCount = 1;
        int len = a.length;

        if (len < 3 || a[0] != 1) {
            return 0;
        }
        for (int i = 1; i < len; i++) {
            if (a[i] == 1 && a[i - 1] == 1) {
                upCount++;
            } else if (a[i] == 2) {
                continue;
            } else if (a[i] == 1 && a[i - 1] == 2) {
                for (int j = len - 1; j > i; j--) {
                    if (a[j] == 2) {
                        return 0;
                    }
                    downCount++;
                }
                break;
            } else {
                return 0;
            }
        }
        if (upCount != downCount) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(is121Array(new int[] { 1, 2, 1 })); // 1
        System.out.println(is121Array(new int[] { 1, 1, 2, 2, 2, 1, 1 })); // 1
        System.out.println(is121Array(new int[] { 1, 1, 2, 2, 2, 1, 1, 1 })); // 0
        System.out.println(is121Array(new int[] { 1, 1, 2, 1, 2, 1, 1 })); // 0
        System.out.println(is121Array(new int[] { 1, 1, 1, 2, 2, 2, 1, 1, 1, 3 })); // 0
        System.out.println(is121Array(new int[] { 1, 1, 1, 1, 1, 1 })); // 0
        System.out.println(is121Array(new int[] { 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1 })); // 0
        System.out.println(is121Array(new int[] { 1, 1, 1, 2, 2, 2, 1, 1, 2, 2 })); // 0
        System.out.println(is121Array(new int[] { 2, 2, 2 })); // 0
    }
}