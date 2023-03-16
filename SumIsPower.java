/**
 * Question 2. Write a function sumIsPower with signatuare
 * boolean sumIsPower(int[] arr)
 * which outputs true if the sum of the elements in the input array arr is a
 * power of 2, false otherwise. Recall that
 * the powers of 2 are 1, 2, 4, 8, 16, and so on. In general a number is a power
 * of 2 if and only if it is of the form 2n
 * for some nonnegative integer n. You may assume (without verifying in your
 * code) that all elements in the array
 * are positive integers. If the input array arr is null, the return value
 * should be false.
 * Examples: sumIsPower({8,8,8,8}) is true since 8 + 8 + 8 + 8 = 32 = 25.
 * sumIsPower({8,8,8}) is false, since 8
 * + 8 +8 = 24, not a power of 2.
 */

public class SumIsPower {
    static boolean sumIsPower(int[] arr) {
        if (arr == null)
            return false;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int i = 0;
        int res = 0;
        int temp;
        while (res < sum) {
            temp = 1;
            for (int j = 1; j <= i; j++) {
                temp *= 2;
            }
            res = temp;
            if (res == sum) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(sumIsPower(new int[] { 8, 8, 8, 8 })); // true
        System.out.println(sumIsPower(new int[] { 8, 8, 8 })); // false
    }
}