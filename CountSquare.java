import java.util.Arrays;;

/**
 * 1.Define a square pair to be the tuple <x, y> where x and y are positive,
 * non-zero integers, x<y and x + y is a perfect square. A perfect
 * square is an integer whose square root is also an integer, e.g. 4, 9, 16 are
 * perfect squares but 3, 10 and 17 are not. Write a functionnamed
 * countSquarePairs that takes an array and returns the number of square pairs
 * that can be constructed from the elements in the
 * array. For example, if the array is {11, 5, 4, 20} the function would return
 * 3 because the only square pairs that can be constructed from
 * those numbers are <5, 11>,
 * <5, 20> and <4, 5>. You may assume that there exists a function named
 * isPerfectSquare that returns 1 if its argument is a
 * perfect square and 0 otherwise. E.G., isPerfectSquare(4) returns 1 and
 * isPerfectSquare(8) returns 0.
 * If you are programming in Java or C#, the function signature is
 * int countSquarePairs(int[ ] a)
 * If you are programming in C++ or C, the function signature is
 * int countSquarePairs(int a[ ], int len) where len is the number of elements
 * in the array.
 * You may assume that there are no duplicate values in the array, i.e, you
 * don't have to deal with an array like {2, 7, 2, 2}.
 */

public class CountSquare {

    public static int isPerfectSquare(int num) {
        int square = 1;
        for (int i = 1; square < num; i++) {
            square = i * i;
            if (square == num) {
                return 1;
            }
        }
        return 0;
    }

    public static int countSquare(int[] a) {
        int len = a.length;
        int cachedValue;
        int count = 0;
        if (len < 2) {
            return 0;
        }
        Arrays.sort(a);
        // 4, 5, 11, 20
        for (int i = 0; i < len; i++) {
            cachedValue = a[i];
            if (a[i] <= 0) {
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                if (a[j] < 0) {
                    continue;
                }

                if (isPerfectSquare(cachedValue + a[j]) == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = { 9 };
        System.out.println(countSquare(a));
    }
}