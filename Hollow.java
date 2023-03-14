/**
 * 3. An array is said to be hollow if it contains 3 or more zeroes in the
 * middle that are preceded and
 * followed by the same number of non-zero elements. Write a function named
 * isHollow that accepts an
 * integer array and returns 1 if it is a hollow array, otherwise it returns 0
 * Examples: isHollow({1,2,4,0,0,0,3,4,5}) returns 1. isHollow
 * ({1,2,0,0,0,3,4,5}) returns 0. isHollow
 * ({1,2,4,9, 0,0,0,3,4, 5}) returns 0. isHollow ({1,2, 0,0, 3,4}) returns 0.
 * If you are programming in Java or C#, the function signature is
 * int isHollow(int[ ] a).
 * If you are C or C++ programmer
 * int isHollow(int[ ] a, int len)
 * where len is the number of elements in the array.
 */

public class Hollow {
    static int isHollow(int[] a) {
        int len = a.length;
        int midIndex = len / 2;
        if (a[midIndex] != 0 || a[midIndex - 1] != 0 || a[midIndex + 1] != 0) {
            return 0;
        }
        int leftCounter = 0, rightCounter = 0;
        for (int i = 0; i < len; i++) {
            if (a[i] != 0)
                leftCounter++;
            else
                break;
        }

        for (int i = leftCounter; i < len; i++) {
            if (a[i] != 0)
                rightCounter++;
        }
        if (leftCounter != rightCounter)
            return 0;
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isHollow(new int[] { 1, 2, 4, 0, 0, 0, 3, 4, 5 })); // 1
        System.out.println(isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4, 5 })); // 0
        System.out.println(isHollow(new int[] { 1, 2, 4, 9, 0, 0, 0, 3, 4, 5 })); // 0
        System.out.println(isHollow(new int[] { 1, 2, 0, 0, 3, 4 })); // 0
        System.out.println(isHollow(new int[] { 1, 2, 3, 4, 0, 0, 0, 0, 5, 6, 7, 8 })); // 1
    }
}