/**
 * Consider an array A with n of positive integers. An integer idx is called a
 * POE (point of equilibrium) of A, if A[0] + A[1] + … + A[idx – 1] is equal to
 * A[idx + 1] + A[idx + 2] + … + A[n – 1]. Write a function to return POE of an
 * array, if it exists and -1 otherwise.
 * The signature of the function is:
 * int f(int[] a)
 */
public class PointOfEquilibrium {
    static int f(int[] a) {
        int leftSum = 0, rightSum = 0, b, len = a.length, i = 0;
        b = len - 1;
        for (int aa = 0; aa < len; i++, b--, aa++) {
            if (leftSum > rightSum) {
                rightSum += a[b];
                i--;
            } else if (rightSum > leftSum) {
                leftSum += a[i];
                b++;
            } else if (leftSum == rightSum) {
                leftSum += a[i];
                rightSum += a[b];
            }
            if ((leftSum == rightSum) && (b - 1 == i + 1)) {
                return b - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[] { 1, 8, 3, 7, 10, 2 })); // 3
        System.out.println(f(new int[] { 1, 5, 3, 1, 1, 1, 1, 1, 1 })); // 2
        System.out.println(f(new int[] { 2, 1, 1, 1, 2, 1, 7 })); // 5
        System.out.println(f(new int[] { 1, 2, 3 })); // -1
        System.out.println(f(new int[] { 3, 4, 5, 10 })); // -1
        System.out.println(f(new int[] { 1, 2, 10, 3, 4 })); // -1
    }
}