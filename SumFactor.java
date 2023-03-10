/**
 * 2. The sum factor of an array is defined to be the number of times that the
 * sum of the array appears as an element of the
 * array. So the sum factor of {1, -1, 1, -1, 1, -1, 1} is 4 because the sum of
 * the elements of the array is 1 and 1 appears four
 * times in the array. And the sum factor of
 * {1, 2, 3, 4} is 0 because the sum of the elements of the array is 10 and 10
 * does not occur as an element of the array. The
 * sum factor of the empty array { } is defined to be 0.
 * Write a function named sumFactor that returns the sum factor of its array
 * argument.
 * If you are programming in Java or C#, the function signature is
 * int sumFactor(int[ ] a)
 * If you are programming in C++ or C, the function signature is
 * int sumFactor(int a[ ], int len) where len is the number of elements in the
 * array.
 */

public class SumFactor {

    public static int sumFactor(int[] a) {
        int len = a.length;
        int sum = 0;
        int count = 0;

        if (len == 0) {
            return 0;
        }

        for (int i = 0; i < len; i++) {
            sum += a[i];
        }

        for (int i = 0; i < len; i++) {
            if (a[i] == sum) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = { 1, -1, 1, -1, 1, -1, 1 };
        int b[] = { 1, 2, 3, 4 };
        int c[] = {};
        int d[] = { 3, 0, 2, -5, 0 };
        int e[] = { 9, -3, -3, -1, -1 };
        int f[] = { 1 };
        int g[] = { 0, 0, 0, 0 };
        System.out.println(sumFactor(a));
        System.out.println(sumFactor(b));
        System.out.println(sumFactor(c));
        System.out.println(sumFactor(d));
        System.out.println(sumFactor(e));
        System.out.println(sumFactor(f));
        System.out.println(sumFactor(g));
    }
}