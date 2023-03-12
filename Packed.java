/**
 * 2. Define an array to be packed if all its values are positive, each value n
 * appears n
 * times and all equal values are in consecutive locations. So for example, {2,
 * 2, 3, 3, 3}
 * is packed because 2 appears twice and 3 appears three times. But {2, 3, 2, 3,
 * 3} is not
 * packed because the 2s are not in consecutive locations. And {2, 2, 2, 3, 3,
 * 3} is not
 * packed because 2 appears three times.
 * Write a method named isPacked that returns 1 if its array argument is packed,
 * otherwise it
 * returns 0. You may assume that the array is not null
 * If you are programming in Java or C#, the function signature is
 * int isPacked(int[ ] a)
 * If you are programming in C++ or C, the function signature is
 * int isPacked(int a[ ], int len) where len is the length of the array.
 */

public class Packed {
    public static int isPacked(int[] a) {
        int count = 1, cached, len = a.length;
        if (len < 1) {
            return 1;
        }
        cached = a[0];
        for (int i = 1; i < len; i++) {
            if (a[i] == cached) {
                count++;
            } else {
                if (count != cached) {
                    return 0;
                }
                for (int j = i; j < len; j++) {
                    if (a[j] == cached) {
                        return 0;
                    }
                }
                cached = a[i];
                count = 1;
            }
        }
        if (count != cached) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isPacked(new int[] { 2, 2, 3, 3, 3 })); // returns 1
        System.out.println(isPacked(new int[] { 2, 3, 2, 3, 3 })); // returns 0
        System.out.println(isPacked(new int[] { 2, 2, 2, 3, 3, 3 })); // returns 0
        System.out.println(isPacked(new int[] { 2, 2, 1 })); // returns 1
        System.out.println(isPacked(new int[] { 2, 2, 1, 2, 2 })); // returns 0
        System.out.println(isPacked(new int[] { 4, 4, 4, 4, 1, 2, 2, 3, 3, 3 })); // returns 1
        System.out.println(isPacked(new int[] { 7, 7, 7, 7, 7, 7, 7, 1 })); // returns 1
        System.out.println(isPacked(new int[] { 7, 7, 7, 7, 1, 7, 7, 7 })); // returns 0
        System.out.println(isPacked(new int[] { 7, 7, 7, 7, 7, 7, 7 })); // returns 1
        System.out.println(isPacked(new int[] {})); // returns 1
        System.out.println(isPacked(new int[] { 1, 2, 1 })); // returns 0
        System.out.println(isPacked(new int[] { 2, 1, 1 })); // returns 0
        System.out.println(isPacked(new int[] { -3, -3, -3 })); // returns 0
        System.out.println(isPacked(new int[] { 0, 2, 2 })); // returns 0
        System.out.println(isPacked(new int[] { 2, 1, 2 })); // returns 0
    }
}