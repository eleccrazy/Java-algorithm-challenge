/**
 * 1. Write a function named largestAdjacentSum that iterates through an array
 * computing the sum of adjacent elements and returning
 * the largest such sum. You may assume that the array has at least 2 elements.
 * If you are writing in Java or C#, the function signature is
 * int largestAdjacentSum(int[ ] a)If you are writing in C or C++, the function
 * signature is
 * int largestAdjacentSum(int a[ ], int len) where len is the number of elements
 * in a
 */
public class LargestAdjacentSum {
    public static int largestAdjacentSum(int[] a) {
        int sum, max = a[0] + a[1];
        for (int i = 2; i < a.length; i++) {
            sum = a[i] + a[i - 1];
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[] { 1, 2, 3, 4 })); // returns 7
        System.out.println(largestAdjacentSum(new int[] { 18, -12, 9, -10 })); // returns 6
        System.out.println(largestAdjacentSum(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 })); // returns 2
        System.out.println(largestAdjacentSum(new int[] { 1, 1, 1, 1, 1, 2, 1, 1, 1 })); // returns 3
    }
}