/**
 * 1. The Stanton measure of an array is computed as follows. Count the number
 * of 1s in the array. Let this count be n. The
 * Stanton measure is the number of times that n appears in the array. For
 * example, the Stanton measure of {1, 4, 3, 2, 1, 2, 3,
 * 2} is 3 because 1 occurs 2 times in the array and 2 occurs 3 times.
 * Write a function named stantonMeasure that returns the Stanton measure of its
 * array argument.
 * If you are programming in Java or C#, the function prototype is
 * int stantonMeasure(int[ ] a)
 * If you are programming in C++ or C, the function prototype is
 * int stantonMeasure(int a[ ], int len) where len is the number of elements in
 * the array.
 */

public class StantonMeasure {

    public static int stantonMeasure(int[] a) {
        int len = a.length;
        int countOnes = 0;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (a[i] == 1) {
                countOnes++;
            }
        }
        for (int j = 0; j < len; j++) {
            if (a[j] == countOnes) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = { 1, 4, 3, 2, 1, 2, 3, 2 };
        int b[] = { 1 };
        int c[] = { 0 };
        int d[] = { 3, 1, 1, 4 };
        int e[] = { 1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4 };
        int f[] = {};
        System.out.println(stantonMeasure(a));
        System.out.println(stantonMeasure(b));
        System.out.println(stantonMeasure(c));
        System.out.println(stantonMeasure(d));
        System.out.println(stantonMeasure(e));
        System.out.println(stantonMeasure(f));
    }
}